#!/usr/bin/env bash

set -e

EXIT_CODE=0

# Build local image
build_test_image() {
    echo "Current branch $(git branch --show-current)"
    docker build -t test-image .
}

run_test_image() {
    local ex_name="$1"
    echo "Run test for $ex_name"
    docker run --read-only \
        --network none \
        --memory 500M \
        --cpus 2.0 \
        --user 1000:1000 \
        --env EXERCISE="$ex_name" \
        --env HOME=/jail \
        --env TMPDIR=/jail \
        --workdir /jail \
        --tmpfs /jail:size=100M,noatime,exec,nodev,nosuid,uid=1000,gid=1000,nr_inodes=5k,mode=1700 \
        --volume "./solutions/:/jail/student" \
        test-image
}

simplify_output() {
    if "$@" >/dev/null 2>&1; then
        echo "$ex_name : ✅ OK"
    else
        echo "$ex_name : ❌ FAIL"
        EXIT_CODE=1
    fi
}

build_test_image

if [[ "$#" -eq 1 ]]; then
    run_test_image "$1"
fi

if [[ "$#" -gt 0 ]]; then
    for ex_name in "$@"; do
        simplify_output run_test_image "$ex_name"
    done
else
    for f in solutions/*; do
        ex_name="$(basename "$f")"
        simplify_output run_test_image "$ex_name"
    done
fi

exit "$EXIT_CODE"
