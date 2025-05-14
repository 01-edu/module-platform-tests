FROM maven:3.9-eclipse-temurin-21-alpine
RUN apk update

WORKDIR /app

COPY tests tests
COPY pom.xml pom.xml
COPY entrypoint.sh ./

RUN mvn -DskipTests -Dmaven.repo.local=/app/tests_utility install
RUN chmod 777 -R /app/tests_utility

### Default configs
# ℹ️ URL of the Repository
LABEL org.opencontainers.image.source=https://github.com/01-edu/java-tests
# ℹ️ Description of the Test Image
LABEL org.opencontainers.image.description="01 Edu - Java Test Image"
# ℹ️ Licence type – MIT by default
LABEL org.opencontainers.image.licenses=MIT

ENTRYPOINT ["/app/entrypoint.sh"]
