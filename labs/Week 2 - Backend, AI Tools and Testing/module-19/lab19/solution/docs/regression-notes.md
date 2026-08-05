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
