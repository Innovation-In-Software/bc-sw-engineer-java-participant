# Exercise 4 — JWT Login TODOs

**Module 28** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab28-jwt-login-todos.md` — complete a JWT login/filter sketch with TODOs (no real secret values).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-jwt-login-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab28-jwt-login-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — JWT Login TODOs

## Step 2 — Fill TODOs
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/lab28-jwt-login-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — JWT Login TODOs

## Step 2 — Fill TODOs

```java
class AuthController {
    // POST /api/auth/login
    Map<String, String> login(String username, String password) {
        // TODO: validate lab user then return token map
        String token = jwtService._____(username); // issue/create
        return Map.of("accessToken", _____);
    }
}

class JwtAuthenticationFilter {
    void doFilter(String authorizationHeader) {
        // TODO: header must start with Bearer
        if (authorizationHeader == null || !authorizationHeader.startsWith(_____)) {
            return; // unauthenticated
        }
        String token = authorizationHeader.substring(7);
        // TODO: parse and set SecurityContext (lab implements fully)
    }
}
```
Hints: `issue`/`createToken` method name per your notes; return `token`; prefix `"Bearer "`.

## Step 3 — Secret hygiene

In `.env.example` style notes, write `JWT_SECRET=_____` placeholder only — never a real production secret.

## Step 4 — Reflect

Soap UsernameToken from Lab 24 is separate from REST JWT — do not conflate them.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

JWT sketch blanks and secret placeholder completed in `notes/lab28-jwt-login-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab28-jwt-login-todos.md` |
| Hard-coding signing key in Git | Use env placeholder / local secret |
| Using correlation id as password | Use real auth credentials / tokens |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab28-jwt-login-todos.md`
- [ ] Login token return filled
- [ ] Bearer prefix filled
- [ ] No real JWT secret committed

