#!/bin/sh

set -e

if test "$CODE_EDITOR_RUN_ONLY" = true; then
    cp -rf /jail/student/*.js .
    
    # empty the test file just in case
    echo "" > test.js

    # process each file in the comma-separated list
    echo "$EDITOR_FILES" | tr ',' '\n' | while IFS= read -r file; do
    # process only non-empty filenames
        if [ -n "$file" ]; then
    # append file contents to test.js
            cat "$file" >> test.js
            echo >> test.js
        fi
    done
    node test.js "$@"
    exit
fi

if test "$EXERCISE" = "elementary"; then
    node  --disallow-code-generation-from-strings /app/test.mjs "/jail/student" "${EXERCISE}" "${EDITOR_FILES}"
    exit
fi

node /app/test.mjs "/jail/student" "${EXERCISE}" "${EDITOR_FILES}"