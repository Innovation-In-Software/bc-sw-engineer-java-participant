# Module 9 exercise solutions (instructor only)

Complete reference implementations for the pre-lab exercises.

**Do not share with participants.** This folder is named `solution/` so `push-all.ps1` excludes it from the participant remote.

| Exercise | Files |
| -------- | ----- |
| 6 Fill a Mini POM | [`pom.xml`](pom.xml), [`src/main/java/com/northstar/crm/BuildDemo.java`](src/main/java/com/northstar/crm/BuildDemo.java), [`src/test/java/com/northstar/crm/BuildDemoTest.java`](src/test/java/com/northstar/crm/BuildDemoTest.java) |

Copy into `module-09-exercises/mini-maven/` preserving paths, then from `mini-maven`:

```text
mvn -q test
mvn -q package
java -jar target/build-demo.jar
```

**Expected:** Surefire one test green; console prints `BuildDemo ready for Lab 9`
