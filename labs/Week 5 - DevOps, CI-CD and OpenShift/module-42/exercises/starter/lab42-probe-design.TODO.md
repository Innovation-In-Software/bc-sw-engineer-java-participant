# Probes

| Probe | Path | Notes |
| --- | --- | --- |
| startup | /actuator/health/readiness | slow boot / Flyway |
| readiness | /actuator/health/readiness | traffic |
| liveness | /actuator/health/liveness | restart if wedged |

Do not point liveness at readiness. Profile `docker` required for these paths.
