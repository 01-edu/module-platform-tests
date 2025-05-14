# ☕️ java-tests

[![🐳 On Master - Build and Test Docker Image](https://github.com/01-edu/java-tests/actions/workflows/ga-image-build-master.yml/badge.svg?branch=master)](https://github.com/01-edu/java-tests/actions/workflows/ga-image-build-master.yml)

Private repository that holds the files needed to build the Java tests Docker image.

## Structure of the repo
```bash
root
 ├ solutions
 | └ [exercise_name]       # This is a Java project
 ├ tests
 | └  [exercise_name]Test  # This is a Java project
 |    └ *                  # Project files named as mentioned in teh subject 
 ├ tests_utility
 | └ *                     # Resources needed for tests to run
 ├ Dockerfile
 └ entrypoint.sh
```

> This structure should be preserved to ensure the `Dockerfile` work properly.

## How does it works
- The `Dockerfile` will copy `tests`, `tests_utility` and `entrypoint.sh` into the image.
- When running, the container will execute `entrypoint.sh` which will test the student solution:
   - This process is done offline.
   - A lot of flags are used with `docker run`; if in doubt, check with DevOps.
