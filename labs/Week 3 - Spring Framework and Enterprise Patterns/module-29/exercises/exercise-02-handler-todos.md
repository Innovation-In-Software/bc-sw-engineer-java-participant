# Exercise 3 — GlobalExceptionHandler TODOs

**Module 29** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab29-handler-todos.md` — complete a handler sketch that builds ErrorResponse for validation and not-found.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-handler-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab29-handler-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 29 — GlobalExceptionHandler TODOs

## Step 2 — Fill TODOs
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/lab29-handler-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — GlobalExceptionHandler TODOs

## Step 2 — Fill TODOs

```java
@_____
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus._____)
    ErrorResponse validation(MethodArgumentNotValidException ex) {
        // TODO: build envelope with field violations + correlation
        return ErrorResponse.validation(_____, ex);
    }

    @ExceptionHandler(CustomerNotFoundException.class)
    @ResponseStatus(HttpStatus._____)
    ErrorResponse notFound(CustomerNotFoundException ex) {
        return ErrorResponse.notFound(ex.getCustomerId());
    }
}
```
Hints: `@RestControllerAdvice`; `BAD_REQUEST`; correlation `"lab-request-001"`; `NOT_FOUND`.

## Step 3 — Controller reminder

Controllers need `@Valid` on `@RequestBody` — write that reminder in notes.

## Step 4 — Reflect

Happy GETs for `CUS-1001` / `CUS-1002` must still return 200 after handlers exist.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Handler sketch blanks filled; `@Valid` reminder written in `notes/lab29-handler-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab29-handler-todos.md` |
| Returning ex.getMessage() with SQL | Use safe, stable messages |
| Forgetting `@Valid` | Without it, Bean Validation never runs |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab29-handler-todos.md`
- [ ] `@RestControllerAdvice` and statuses filled
- [ ] `@Valid` reminder present
- [ ] Happy-path 200 called out

