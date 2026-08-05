# Lab 19 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-19-GUIDE.md`](../LAB-19-GUIDE.md)

## Goal

**Spring Boot API IT + Selenium Page Object UI IT**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab19-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab19-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab19-crm
mvn -B clean test
```

**Expected:** Tests run: 4

## File index (13 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/api/CustomerController.java` |
| 2 | `src/main/java/com/northstar/crm/CrmApplication.java` |
| 3 | `src/main/java/com/northstar/crm/model/Customer.java` |
| 4 | `src/main/java/com/northstar/crm/repository/CustomerRepository.java` |
| 5 | `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java` |
| 6 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 7 | `src/main/resources/application.yml` |
| 8 | `src/main/resources/static/customers.html` |
| 9 | `src/test/java/com/northstar/crm/integration/CustomerApiIT.java` |
| 10 | `src/test/java/com/northstar/crm/ui/CustomerUiIT.java` |
| 11 | `src/test/java/com/northstar/crm/ui/pages/CustomerFormPage.java` |
| 12 | `pom.xml` |
| 13 | `docs/regression-notes.md` |

## Full source

### `src/main/java/com/northstar/crm/api/CustomerController.java`

```java
package com.northstar.crm.api;

import com.northstar.crm.model.Customer;
import com.northstar.crm.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customers;

    public CustomerController(CustomerService customers) {
        this.customers = customers;
    }

    @PostMapping
    public ResponseEntity<Customer> create(
            @RequestHeader(value = "X-Correlation-Id", required = false) String correlationId,
            @RequestBody Customer body) {
        String corr = (correlationId == null || correlationId.isBlank())
                ? "lab-request-001" : correlationId;
        Customer created = customers.create(body, corr);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("X-Correlation-Id", corr)
                .body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> get(@PathVariable String id) {
        return customers.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
```

### `src/main/java/com/northstar/crm/CrmApplication.java`

```java
package com.northstar.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrmApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }
}
```

### `src/main/java/com/northstar/crm/model/Customer.java`

```java
package com.northstar.crm.model;

public class Customer {
    private String customerId;
    private String fullName;
    private String email;
    private String status;

    public Customer() {}

    public Customer(String customerId, String fullName, String email, String status) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.status = status;
    }

    public static Customer amina() {
        return new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE");
    }

    public static Customer ravi() {
        return new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", "PROSPECT");
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
```

### `src/main/java/com/northstar/crm/repository/CustomerRepository.java`

```java
package com.northstar.crm.repository;

import com.northstar.crm.model.Customer;
import java.util.Optional;

public interface CustomerRepository {
    Customer save(Customer customer);
    Optional<Customer> findById(String customerId);
}
```

### `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`

```java
package com.northstar.crm.repository;

import com.northstar.crm.model.Customer;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private final Map<String, Customer> store = new ConcurrentHashMap<>();

    public InMemoryCustomerRepository() {
        store.put("CUS-1001", Customer.amina());
        store.put("CUS-1002", Customer.ravi());
    }

    @Override
    public Customer save(Customer customer) {
        store.put(customer.getCustomerId(), customer);
        return customer;
    }

    @Override
    public Optional<Customer> findById(String customerId) {
        return Optional.ofNullable(store.get(customerId));
    }
}
```

### `src/main/java/com/northstar/crm/service/CustomerService.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.model.Customer;
import com.northstar.crm.repository.CustomerRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer create(Customer customer, String correlationId) {
        if (customer.getCustomerId() == null || customer.getCustomerId().isBlank()) {
            throw new IllegalArgumentException("customerId required [" + correlationId + "]");
        }
        return repository.save(customer);
    }

    public Optional<Customer> findById(String customerId) {
        return repository.findById(customerId);
    }
}
```

### `src/main/resources/application.yml`

```yaml
server.port: 8080
spring.application.name: lab19-crm
```

### `src/main/resources/static/customers.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8"/>
  <title>Northstar CRM — Customers</title>
</head>
<body>
  <h1>Create customer</h1>
  <form id="customer-form">
    <label>ID <input name="customerId" data-testid="customer-id"/></label>
    <label>Name <input name="fullName" data-testid="full-name"/></label>
    <label>Email <input name="email" data-testid="email"/></label>
    <label>Status <input name="status" data-testid="status" value="PROSPECT"/></label>
    <button type="submit" data-testid="submit-customer">Create</button>
  </form>
  <pre data-testid="create-result" id="result"></pre>
  <script>
    document.getElementById('customer-form').addEventListener('submit', async (e) => {
      e.preventDefault();
      const body = {
        customerId: document.querySelector('[data-testid="customer-id"]').value,
        fullName: document.querySelector('[data-testid="full-name"]').value,
        email: document.querySelector('[data-testid="email"]').value,
        status: document.querySelector('[data-testid="status"]').value
      };
      const res = await fetch('/api/customers', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          'X-Correlation-Id': 'lab-request-001'
        },
        body: JSON.stringify(body)
      });
      const text = await res.text();
      document.getElementById('result').textContent = text;
    });
  </script>
</body>
</html>
```

### `src/test/java/com/northstar/crm/integration/CustomerApiIT.java`

```java
package com.northstar.crm.integration;

import com.northstar.crm.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerApiIT {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate rest;

    private String url(String path) {
        return "http://localhost:" + port + path;
    }

    @Test
    void getAminaReturns200() {
        ResponseEntity<Customer> res = rest.getForEntity(url("/api/customers/CUS-1001"), Customer.class);
        assertEquals(HttpStatus.OK, res.getStatusCode());
        assertNotNull(res.getBody());
        assertEquals("CUS-1001", res.getBody().getCustomerId());
    }

    @Test
    void createEchoesCorrelationHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Correlation-Id", "lab-request-001");
        headers.setContentType(MediaType.APPLICATION_JSON);
        Customer body = new Customer("CUS-1901", "Lab Nineteen", "lab19@example.com", "PROSPECT");
        ResponseEntity<Customer> created = rest.exchange(
                url("/api/customers"),
                HttpMethod.POST,
                new HttpEntity<>(body, headers),
                Customer.class);
        assertEquals(HttpStatus.CREATED, created.getStatusCode());
        assertEquals("lab-request-001", created.getHeaders().getFirst("X-Correlation-Id"));
        assertNotNull(created.getBody());
        assertEquals("CUS-1901", created.getBody().getCustomerId());
    }

    @Test
    void missingCustomerReturns404() {
        ResponseEntity<Customer> res = rest.getForEntity(url("/api/customers/CUS-9999"), Customer.class);
        assertEquals(HttpStatus.NOT_FOUND, res.getStatusCode());
    }
}
```

### `src/test/java/com/northstar/crm/ui/CustomerUiIT.java`

```java
package com.northstar.crm.ui;

import com.northstar.crm.ui.pages.CustomerFormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerUiIT {

    @LocalServerPort
    int port;

    WebDriver driver;

    @BeforeAll
    static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--window-size=1280,900", "--disable-gpu");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void quit() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void createCustomerViaUi() {
        String baseUrl = "http://localhost:" + port;
        CustomerFormPage page = new CustomerFormPage(driver).open(baseUrl);
        page.fill("CUS-2001", "Ui Customer", "ui.customer@example.com", "PROSPECT");
        page.submit();
        String result = page.resultText();
        assertTrue(result.contains("CUS-2001"), () -> "expected CUS-2001 in: " + result);
    }
}
```

### `src/test/java/com/northstar/crm/ui/pages/CustomerFormPage.java`

```java
package com.northstar.crm.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/** Page Object — locate via data-testid only. */
public class CustomerFormPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public CustomerFormPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public CustomerFormPage open(String baseUrl) {
        driver.get(baseUrl + "/customers.html");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[data-testid='customer-id']")));
        return this;
    }

    public void fill(String id, String name, String email, String status) {
        type("[data-testid='customer-id']", id);
        type("[data-testid='full-name']", name);
        type("[data-testid='email']", email);
        type("[data-testid='status']", status);
    }

    public void submit() {
        driver.findElement(By.cssSelector("[data-testid='submit-customer']")).click();
    }

    public String resultText() {
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[data-testid='create-result']")));
        wait.until(d -> {
            String text = d.findElement(By.cssSelector("[data-testid='create-result']")).getText();
            return text != null && !text.isBlank();
        });
        return result.getText();
    }

    private void type(String css, String value) {
        WebElement el = driver.findElement(By.cssSelector(css));
        el.clear();
        el.sendKeys(value);
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
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.3.5</version>
    <relativePath/>
  </parent>
  <groupId>com.northstar</groupId>
  <artifactId>lab19-crm</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>lab19-crm</name>
  <properties>
    <java.version>21</java.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>5.9.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <configuration>
          <!-- Spring Boot parent excludes *IT by default; ApiIT + UiIT are the timed suite -->
          <includes>
            <include>**/*Test.java</include>
            <include>**/*Tests.java</include>
            <include>**/*IT.java</include>
          </includes>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
  </build>
</project>
```

### `docs/regression-notes.md`

```markdown
# Lab 19 — Regression notes (solution)

## Pyramid

| Layer | Suite | Protects |
| --- | --- | --- |
| Unit (Labs 17–18) | Service / Mockito | Business rules without HTTP |
| Integration | `CustomerApiIT` | HTTP create/get + correlation + 404 |
| UI | `CustomerUiIT` + Page Object | Form → fetch → API happy path |

Do **not** replace unit tests with UI-only coverage.

## Locators

Prefer `data-testid` (`customer-id`, `full-name`, `email`, `status`, `submit-customer`, `create-result`). Explicit waits only — no `Thread.sleep` as primary sync.

## Correlation

POST sends `X-Correlation-Id: lab-request-001`; API echoes the header on create.

## CI browser strategy

Headless Chrome via WebDriverManager. Do not commit ChromeDriver binaries. If Chrome is missing, `CustomerApiIT` still proves the HTTP contract; document UI skip for that environment.
```

## Instructor notes

# Lab 19 solution notes

## What / why

Spring Boot CRM with HTTP create/get, static `customers.html` form using `data-testid`, `CustomerApiIT` for correlation/404, and Selenium Page Object UI IT for `CUS-2001`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-19\lab19\solution"
mvn -B -Dtest=CustomerApiIT test
mvn -B -Dtest=CustomerUiIT test
```

`CustomerApiIT` needs no Docker. `CustomerUiIT` needs Chrome/Chromium installed (WebDriverManager downloads the driver).

## Pitfalls

- UI timeouts usually mean JS/API failed — green ApiIT first.
- Implicit + explicit waits stacked → prefer explicit only.
- Do not commit `target/` or ChromeDriver binaries.


