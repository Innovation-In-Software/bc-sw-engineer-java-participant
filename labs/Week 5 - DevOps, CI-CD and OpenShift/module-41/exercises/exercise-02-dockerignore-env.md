# Exercise 2 — Plan .dockerignore and Env

**Module 41** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab41-dockerignore-env.md` — list files that must never enter build context and how config is injected.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-41-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-dockerignore-env.md` (this file in the course repo) |
| Your notes file | `notes/lab41-dockerignore-env.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 41 — Plan .dockerignore and Env

## Step 1 — Ignore list

Draft `.dockerignore` candidates: `.git`, `target/`, `.env`, `*.tfstate`, `notes/`, IDE folders.

## Step 2 — Check the reference

Runtime config via env (DB URL, user, password)—never `ENV PASSWORD=...` in Dockerfile.

## Step 3 — .env.example

List keys only (no values): `SPRING_DATASOURCE_URL`, username, password placeholders, Java opts.

## Step 4 — Evidence path

Note where Lab 41 will store `docker images` / inspect evidence under `notes/screenshots/lab-41/`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-41-exercises/`, create `notes/` if needed, then create `notes/lab41-dockerignore-env.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 41 — Plan .dockerignore and Env

## Step 1 — Ignore list

Draft `.dockerignore` candidates: `.git`, `target/`, `.env`, `*.tfstate`, `notes/`, IDE folders.

## Step 2 — Check the reference

Runtime config via env (DB URL, user, password)—never `ENV PASSWORD=...` in Dockerfile.

## Step 3 — .env.example

List keys only (no values): `SPRING_DATASOURCE_URL`, username, password placeholders, Java opts.

## Step 4 — Evidence path

Note where Lab 41 will store `docker images` / inspect evidence under `notes/screenshots/lab-41/`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Ignore list and .env.example key list without secrets in `notes/lab41-dockerignore-env.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab41-dockerignore-env.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 41 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab41-dockerignore-env.md`
- [ ] .dockerignore candidates listed
- [ ] No password baked into Dockerfile plan
- [ ] .env.example keys only

