# Exercise 6 — Fill a Mini POM

**Module 9** · Small Maven exercise · [setup](EXERCISES-INDEX.md)

## Goal

Build a tiny Maven project that compiles, runs one JUnit test, and packages a JAR with a `Main-Class` — before you expand the full Lab 9 CRM POM.

> No Spring Boot, JPA, Kafka, or React. Plain Java + JUnit Jupiter only.

## Files

```text
mini-maven/
├── pom.xml
└── src/
    ├── main/java/com/northstar/crm/BuildDemo.java
    └── test/java/com/northstar/crm/BuildDemoTest.java
```

## Starter (fill in the TODOs)

From `module-09-exercises`, create `mini-maven/` and the paths above. Paste each skeleton, then replace every `_____` and `<!-- TODO -->` with working values. Do **not** leave TODOs in your finished files.

### `pom.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <!-- TODO: Northstar coordinates -->
  <groupId>_____</groupId>
  <artifactId>_____</artifactId>
  <version>_____</version>
  <packaging>_____</packaging>

  <name>Module 9 Mini Maven</name>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.release>21</maven.compiler.release>
    <junit.version>5.11.4</junit.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>${junit.version}</version>
      <!-- TODO: test scope so JUnit is not a production dependency -->
      <scope>_____</scope>
    </dependency>
  </dependencies>

  <build>
    <finalName>build-demo</finalName>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.13.0</version>
        <configuration>
          <!-- TODO: JDK release -->
          <release>_____</release>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.5.2</version>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.4.2</version>
        <configuration>
          <archive>
            <manifest>
              <!-- TODO: fully qualified Main class -->
              <mainClass>_____</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
```

| Blank | Expected value |
| ----- | -------------- |
| `groupId` | `com.northstar` |
| `artifactId` | `build-demo` |
| `version` | `0.1.0-SNAPSHOT` |
| `packaging` | `jar` |
| JUnit `scope` | `test` |
| compiler `release` | `21` |
| `mainClass` | `com.northstar.crm.BuildDemo` |

### `BuildDemo.java`

```java
package com.northstar.crm;

public class BuildDemo {
    public static void main(String[] args) {
        // TODO: print exactly: BuildDemo ready for Lab 9
        System.out.println("_____");
    }

    public static String greeting() {
        return "BuildDemo ready for Lab 9";
    }
}
```

### `BuildDemoTest.java`

```java
package com.northstar.crm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildDemoTest {
    @Test
    void greetingMatchesBanner() {
        // TODO: assert greeting() equals "BuildDemo ready for Lab 9"
        assertEquals("_____", BuildDemo.greeting());
    }
}
```

## Steps

### Step 1 — Create the tree and fill blanks

Use the expected values table. Save all three files.

### Step 2 — Run Maven from `mini-maven/`

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-09-exercises\mini-maven
mvn -q test
mvn -q package
java -jar target\build-demo.jar
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-09-exercises/mini-maven
mvn -q test
mvn -q package
java -jar target/build-demo.jar
```

### Step 3 — Capture evidence

In `mini-maven-notes.md` record:

- last lines of `mvn -q test` (or note `BUILD SUCCESS`);
- that `target/build-demo.jar` exists;
- console output from `java -jar`.

## Expected result

```text
BuildDemo ready for Lab 9
```

Surefire reports one passing test. `target/build-demo.jar` runs `BuildDemo`.

## If it fails

| Problem | Fix |
| ------- | --- |
| `package does not exist: org.junit` | Confirm `<scope>test</scope>` and that the test file is under `src/test/java` |
| Wrong packaging / no JAR | Confirm `<packaging>jar</packaging>` and `mvn package` |
| `no main manifest attribute` | Set `mainClass` to `com.northstar.crm.BuildDemo` |
| Compiler release error | Set `<release>21</release>` and use JDK 21 |

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | `mvn -q test` succeeds | Pass / Fail |
| 2 | `java -jar target/build-demo.jar` prints the banner | Pass / Fail |
| 3 | JUnit is `test` scope; compiler release is 21 | Pass / Fail |
