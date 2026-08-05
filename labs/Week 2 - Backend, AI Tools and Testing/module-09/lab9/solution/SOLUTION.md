# Lab 9 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-9-GUIDE.md`](../LAB-9-GUIDE.md)

## Goal

**Maven packaging, plugins, profiles, PlaceholderTest**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab9-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab9-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab9-crm
mvn -B clean verify
```

**Expected:** Tests run: 1; customer-service.jar built

## File index (15 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/config/AppConfig.java` |
| 2 | `src/main/java/com/northstar/crm/controller/CustomerController.java` |
| 3 | `src/main/java/com/northstar/crm/dto/CustomerRequest.java` |
| 4 | `src/main/java/com/northstar/crm/dto/CustomerResponse.java` |
| 5 | `src/main/java/com/northstar/crm/entity/Customer.java` |
| 6 | `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java` |
| 7 | `src/main/java/com/northstar/crm/Main.java` |
| 8 | `src/main/java/com/northstar/crm/repository/CustomerRepository.java` |
| 9 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 10 | `src/test/java/com/northstar/crm/PlaceholderTest.java` |
| 11 | `pom.xml` |
| 12 | `docs/CODING-STANDARDS.md` |
| 13 | `docs/dependency-tree.txt` |
| 14 | `docs/layer-flow.md` |
| 15 | `docs/lifecycle-evidence.md` |

## Full source

### `src/main/java/com/northstar/crm/config/AppConfig.java`

```java
package com.northstar.crm.config;

public class AppConfig {
}
```

### `src/main/java/com/northstar/crm/controller/CustomerController.java`

```java
package com.northstar.crm.controller;

import com.northstar.crm.dto.CustomerRequest;
import com.northstar.crm.dto.CustomerResponse;
import com.northstar.crm.service.CustomerService;

public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerResponse createCustomer(CustomerRequest request) {
        return customerService.create(request);
    }

    public CustomerResponse getCustomer(String customerId) {
        return customerService.getById(customerId);
    }
}
```

### `src/main/java/com/northstar/crm/dto/CustomerRequest.java`

```java
package com.northstar.crm.dto;

public class CustomerRequest {
}
```

### `src/main/java/com/northstar/crm/dto/CustomerResponse.java`

```java
package com.northstar.crm.dto;

public class CustomerResponse {
}
```

### `src/main/java/com/northstar/crm/entity/Customer.java`

```java
package com.northstar.crm.entity;

/** Domain customer — filled in Labs 10+. */
public class Customer {
}
```

### `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java`

```java
package com.northstar.crm.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String customerId) {
        super("Customer not found: " + customerId);
    }
}
```

### `src/main/java/com/northstar/crm/Main.java`

```java
package com.northstar.crm;

/**
 * Manual entry point — Lab 9 JAR Main-Class.
 * Example IDs: CUS-1001 Amina Khan ACTIVE; CUS-1002 Ravi Singh PROSPECT.
 * Correlation ID: lab-request-001
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Northstar CRM skeleton — Lab 8");
        System.out.println("Packages: controller, service, repository, entity, dto, config, exception");
        System.out.println("Examples: CUS-1001 Amina Khan ACTIVE | CUS-1002 Ravi Singh PROSPECT");
    }
}
```

### `src/main/java/com/northstar/crm/repository/CustomerRepository.java`

```java
package com.northstar.crm.repository;

import com.northstar.crm.entity.Customer;
import java.util.Optional;

public class CustomerRepository {
    public Optional<Customer> findById(String customerId) {
        throw new UnsupportedOperationException("Lab 8 stub — implement later");
    }

    public Customer save(Customer customer) {
        throw new UnsupportedOperationException("Lab 8 stub — implement later");
    }
}
```

### `src/main/java/com/northstar/crm/service/CustomerService.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.dto.CustomerRequest;
import com.northstar.crm.dto.CustomerResponse;
import com.northstar.crm.repository.CustomerRepository;

public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerResponse create(CustomerRequest request) {
        throw new UnsupportedOperationException("Lab 8 stub — implement later");
    }

    public CustomerResponse getById(String customerId) {
        throw new UnsupportedOperationException("Lab 8 stub — implement later");
    }
}
```

### `src/test/java/com/northstar/crm/PlaceholderTest.java`

```java
package com.northstar.crm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlaceholderTest {
    @Test
    void projectCoordinatesAreMeaningful() {
        assertTrue(true, "Replace with real CRM tests in Labs 11/17");
    }
}
```

### `pom.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.northstar</groupId>
  <artifactId>customer-service</artifactId>
  <version>0.1.0-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>Northstar Customer Service</name>
  <description>Customer Management Platform — Maven build lab</description>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.release>21</maven.compiler.release>
    <junit.version>5.11.4</junit.version>
    <spring.version>6.2.3</spring.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>${spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>${junit.version}</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <finalName>customer-service</finalName>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.13.0</version>
        <configuration>
          <release>21</release>
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
              <mainClass>com.northstar.crm.Main</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
  </build>

  <profiles>
    <profile>
      <id>dev</id>
      <activation>
        <activeByDefault>true</activeByDefault>
      </activation>
      <properties>
        <app.environment>dev</app.environment>
      </properties>
    </profile>
    <profile>
      <id>test</id>
      <properties>
        <app.environment>test</app.environment>
      </properties>
    </profile>
    <profile>
      <id>prod</id>
      <properties>
        <app.environment>prod</app.environment>
      </properties>
    </profile>
  </profiles>
</project>
```

### `docs/CODING-STANDARDS.md`

```markdown
# Coding standards (from Lab 8)

Packages: controller, service, repository, entity, dto, config, exception.
```

### `docs/dependency-tree.txt`

```text
# Annotated dependency tree (Lab 9)
# Capture refreshed with: mvn dependency:tree
#
# Direct vs transitive:
# - DIRECT: spring-context (compile), junit-jupiter (test)
# - TRANSITIVE: spring-aop, spring-beans, spring-core, spring-expression under spring-context
# - junit-jupiter stays test scope so it does not ship as a production runtime dependency
# - Example +- line: spring-context children with siblings
# - Example \- line: last child under a parent (often junit-jupiter at root)

com.northstar:customer-service:jar:0.1.0-SNAPSHOT
+- org.springframework:spring-context:jar:6.2.3:compile
|  +- org.springframework:spring-aop:jar:6.2.3:compile
|  +- org.springframework:spring-beans:jar:6.2.3:compile
|  +- org.springframework:spring-core:jar:6.2.3:compile
|  \- org.springframework:spring-expression:jar:6.2.3:compile
\- org.junit.jupiter:junit-jupiter:jar:5.11.4:test
```

### `docs/layer-flow.md`

```markdown
# Layer flow

Create CUS-1001 via controller → service → repository → entity.
```

### `docs/lifecycle-evidence.md`

```markdown
# Lifecycle evidence (Lab 9)

| Phase | Command | Result | Notes |
| ----- | ------- | ------ | ----- |
| validate | `mvn validate` | BUILD SUCCESS | POM parses |
| compile | `mvn compile` | BUILD SUCCESS | JDK 21 sources |
| test | `mvn test` | BUILD SUCCESS | PlaceholderTest, Tests run: 1 |
| package | `mvn package` | BUILD SUCCESS | `target/customer-service.jar` |
| verify | `mvn verify` | BUILD SUCCESS | Same as package for this POM |
| install | `mvn install` | BUILD SUCCESS | Installed under `~/.m2/repository/com/northstar/customer-service/0.1.0-SNAPSHOT/` |

## Dependency tree

See `docs/dependency-tree.txt`. Direct deps: `spring-context` (compile), `junit-jupiter` (test). Transitives under spring-context (`spring-aop`, `spring-beans`, …). JUnit must remain `test` scope.
```

## Instructor notes

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


