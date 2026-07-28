# Exercise 3 — GlobalExceptionHandler TODOs

**Module 29** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a handler sketch that builds ErrorResponse for validation and not-found.

## Steps

### Step 1 — Create sketch

Create `notes/GlobalExceptionHandlerSketch.java`.

### Step 2 — Fill TODOs

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

### Step 3 — Controller reminder

Controllers need `@Valid` on `@RequestBody` — write that reminder in notes.

### Step 4 — Reflect

Happy GETs for `CUS-1001` / `CUS-1002` must still return 200 after handlers exist.

## Expected result

Handler sketch blanks filled; `@Valid` reminder written.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Returning ex.getMessage() with SQL | Use safe, stable messages |
| Forgetting `@Valid` | Without it, Bean Validation never runs |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | `@RestControllerAdvice` and statuses filled | Pass / Fail |
| 2 | `@Valid` reminder present | Pass / Fail |
| 3 | Happy-path 200 called out | Pass / Fail |
