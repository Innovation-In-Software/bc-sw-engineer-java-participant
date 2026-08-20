# syntax=docker/dockerfile:1
# TODO(lab41): Pin base image digests if instructor provides them.
# Lab 40 CRM has no Maven Wrapper — use mvn in this image (maven:3.9-eclipse-temurin-21).
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /workspace
COPY pom.xml .
# TODO(lab41): dependency:go-offline before COPY src for layer cache
RUN mvn -B -q dependency:go-offline || true
COPY src ./src
# TODO(lab41): Keep -DskipTests here — Testcontainers cannot run during docker build
RUN mvn -B -DskipTests package && cp target/*-SNAPSHOT.jar target/app.jar

FROM eclipse-temurin:21-jre
# TODO(lab41): Create non-root user UID 10001
# RUN groupadd --system --gid 10001 spring \
#  && useradd --system --uid 10001 --gid spring --create-home spring
WORKDIR /app
# TODO(lab41): COPY --from=build --chown=spring:spring /workspace/target/app.jar /app/app.jar
COPY --from=build /workspace/target/app.jar /app/app.jar
# TODO(lab41): USER 10001 — never run as root in runtime stage
EXPOSE 8080
ENV JAVA_TOOL_OPTIONS="-XX:MaxRAMPercentage=75.0"
# TODO(lab41): Never ENV CRM_DB_PASSWORD or bake secrets into layers
# TODO(lab41): HEALTHCHECK against readiness — JRE has no curl/wget; use /dev/tcp
# HEALTHCHECK --interval=30s --timeout=3s --start-period=40s --retries=3 \
#   CMD ["bash", "-c", "exec 3<>/dev/tcp/127.0.0.1/8080 && printf 'GET /actuator/health/readiness HTTP/1.0\r\nHost: localhost\r\n\r\n' >&3 && cat <&3 | grep -q UP"]
ENTRYPOINT ["java","-jar","/app/app.jar"]
