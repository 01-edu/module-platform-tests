#!/bin/sh

set -e

mkdir -p project/src/main/java
mkdir -p project/src/test/java

# ! support both variables CODE_EDITOR_RUN_ONLY and EXAM_RUN_ONLY
CODE_EDITOR_RUN_ONLY="${CODE_EDITOR_RUN_ONLY:-$EXAM_RUN_ONLY}"
# ! support both variables CODE_EDITOR_MODE and EXAM_MODE
CODE_EDITOR_MODE="${CODE_EDITOR_MODE:-$EXAM_MODE}"

if test "$CODE_EDITOR_RUN_ONLY" = true; then
	cd ./student/
    cp -rf *.java ../project/src/main/java
    cd ../project/src/main/java
    javac *.java -d build
    java -cp build ExerciseRunner
	exit
fi

if [ -z "$EDITOR_FILES" ]; then
    cp -rf "./student/${EXERCISE}/"*.java ./project/src/main/java
else
    cd ./student/
    cp -rf $(echo $EDITOR_FILES | tr ',' ' ') ../project/src/main/java
    cd -
fi

cp -rf "/app/tests/StopAfterFailureExtension.java" ./project/src/main/java

cp -rf "/app/tests/${EXERCISE}_test"/*.java ./project/src/main/java

cp /app/pom.xml ./project

cd project

find -name "*.java" > sources.txt

mvn compile -Dmaven.repo.local=/app/tests_utility \
            -Dmaven.compiler.include=@sources.txt exec:java \
            -Dexec.args="--details=tree --disable-banner --select-class ${EXERCISE}Test"