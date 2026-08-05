# Lab 9 — Instructor solution notes

## What was implemented

- Full Maven POM: coordinates, Spring placeholder + JUnit test scope, compiler/Surefire/jar plugins, `finalName=customer-service`.
- Profiles `dev` (default), `test`, `prod`.
- `PlaceholderTest` green; Lab 8 layer stubs retained.
- Lifecycle evidence + annotated dependency tree docs.

## Key files

- `pom.xml`, `src/test/.../PlaceholderTest.java`, `Main.java`
- `docs/lifecycle-evidence.md`, `docs/dependency-tree.txt`
- `src/main/resources/application-dev.properties`

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-09\lab9\solution"
mvn -q clean test
mvn -q clean package
java -jar target\customer-service.jar
mvn -B verify
```

## Pitfalls

- Do not use `-q` when capturing `dependency:tree`.
- Keep JUnit `test` scope; no `@SpringBootApplication` in Week 2.
