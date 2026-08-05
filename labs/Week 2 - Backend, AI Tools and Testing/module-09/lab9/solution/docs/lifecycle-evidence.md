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
