# Exercise 4 — JWT Login TODOs

**Module 28** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a JWT login/filter sketch with TODOs (no real secret values).

## Steps

### Step 1 — Create sketch

Create `notes/JwtSecuritySketch.java`.

### Step 2 — Fill TODOs

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

### Step 3 — Secret hygiene

In `.env.example` style notes, write `JWT_SECRET=_____` placeholder only — never a real production secret.

### Step 4 — Reflect

Soap UsernameToken from Lab 24 is separate from REST JWT — do not conflate them.

## Expected result

JWT sketch blanks and secret placeholder completed.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Hard-coding signing key in Git | Use env placeholder / local secret |
| Using correlation id as password | Use real auth credentials / tokens |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Login token return filled | Pass / Fail |
| 2 | Bearer prefix filled | Pass / Fail |
| 3 | No real JWT secret committed | Pass / Fail |
