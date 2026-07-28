# Exercise 3 — application.yml Sketch

**Module 23** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch YAML keys Lab 23 will use without committing secrets.

## Reference

| Key | Example |
| --- | --- |
| `spring.application.name` | `northstar-crm` |
| `server.port` | `8080` |
| `logging.level.root` | `INFO` |

## Steps

### Step 1 — Draft YAML

Create `notes/application-yml-sketch.yml` with `spring.application.name`, `server.port`, and a logging level. No passwords.

### Step 2 — Check the reference

Confirm keys match the reference table style.

### Step 3 — Profile teaser

Add a commented line mentioning `spring.profiles.active` — Lab 26 deepens this; do not invent prod secrets.

### Step 4 — Security hygiene

Write: real DB passwords never go in committed YAML.

## Expected result

Safe YAML sketch exists with no secrets.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Name and port present | Pass / Fail |
| 2 | No secret values committed | Pass / Fail |
| 3 | Profile called out as Lab 26 topic | Pass / Fail |
