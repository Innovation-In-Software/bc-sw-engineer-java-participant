# Exercise 4 — Fill Dockerfile TODO Skeleton

**Module 41** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a skeleton with blanks (do not claim a finished Lab 41 image).

## Steps

### Step 1 — Skeleton

Create `Dockerfile.skeleton` notes:
```
FROM _____ AS build
WORKDIR /workspace
COPY _____ .
RUN ./mvnw -B -DskipTests package
FROM _____ AS runtime
USER _____
COPY --from=build _____ /app/app.jar
HEALTHCHECK CMD _____
ENTRYPOINT ["java","-jar","/app/app.jar"]
```

### Step 2 — Fill blanks

Fill JDK/JRE image tags, copy paths, USER, and HEALTHCHECK using course conventions.

### Step 3 — Peer check

Mark any blank you are unsure about for Lab 41 confirmation.

### Step 4 — Security scrub

Confirm no secret ARG/ENV slipped in.

## Expected result

A filled Dockerfile skeleton ready for Lab 41 verification.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All major blanks filled or marked unsure | Pass / Fail |
| 2 | Non-root USER set | Pass / Fail |
| 3 | No secrets present | Pass / Fail |
