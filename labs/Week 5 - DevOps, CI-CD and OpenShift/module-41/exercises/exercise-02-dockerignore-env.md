# Exercise 2 — Plan .dockerignore and Env

**Module 41** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List files that must never enter build context and how config is injected.

## Steps

### Step 1 — Ignore list

Draft `.dockerignore` candidates: `.git`, `target/`, `.env`, `*.tfstate`, `notes/`, IDE folders.

### Step 2 — Check the reference

Runtime config via env (DB URL, user, password)—never `ENV PASSWORD=...` in Dockerfile.

### Step 3 — .env.example

List keys only (no values): `SPRING_DATASOURCE_URL`, username, password placeholders, Java opts.

### Step 4 — Evidence path

Note where Lab 41 will store `docker images` / inspect evidence under `notes/screenshots/lab-41/`.

## Expected result

Ignore list and .env.example key list without secrets.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | .dockerignore candidates listed | Pass / Fail |
| 2 | No password baked into Dockerfile plan | Pass / Fail |
| 3 | .env.example keys only | Pass / Fail |
