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
