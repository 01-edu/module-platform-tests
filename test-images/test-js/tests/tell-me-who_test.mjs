import * as cp from 'node:child_process'
import { mkdir, writeFile } from 'node:fs/promises'
import { tmpdir } from 'node:os'
import { isAbsolute, join } from 'node:path'
import { promisify } from 'node:util'

const exec = promisify(cp.exec)
export const tests = []

export const setup = async ({ path }) => {
  const dir = `${tmpdir()}/tell-me-who`
  await mkdir(dir)

  const createFilesIn = async ({ fileNames, dirPath }) =>
    await Promise.all(
      fileNames.map(
        async fileName => await writeFile(`${dirPath}/${fileName}`, ''),
      ),
    )

  const run = async cmd => {
    const cmdPath = isAbsolute(cmd || '') ? cmd : join(dir, cmd || '')
    const { stdout } = await exec(`node ${path} ${cmdPath}`)

    return { stdout: stdout.trim() }
  }

  return { tmpPath: dir, run, createFilesIn }
}

tests.push(async ({ eq, ctx, randStr, upperFirst }) => {
  const random = upperFirst(randStr())
  const fileNames = [
    'Ubaid_Ballard.json',
    'Victoria_Chan.json',
    'Dominika_Mullen.json',
    'Heath_Denton.json',
    `${random}_Hamilton.json`,
  ]
  const dirName = `them-${randStr()}`
  const dirPath = join(ctx.tmpPath, dirName)
  await mkdir(dirPath)
  await ctx.createFilesIn({ dirPath, fileNames })

  const { stdout } = await ctx.run(dirName)
  return eq(stdout.split('\n'), [
    `1. Ballard Ubaid`,
    `2. Chan Victoria`,
    `3. Denton Heath`,
    `4. Hamilton ${random}`,
    `5. Mullen Dominika`,
  ])
})

Object.freeze(tests)
