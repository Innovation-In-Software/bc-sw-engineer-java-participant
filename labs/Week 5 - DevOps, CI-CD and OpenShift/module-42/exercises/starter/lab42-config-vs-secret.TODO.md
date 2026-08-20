# Config vs Secret

| Key | ConfigMap or Secret? |
| --- | --- |
| CRM_DB_HOST | ConfigMap TODO |
| CRM_DB_NAME | ConfigMap TODO |
| CRM_DB_USER | ConfigMap TODO |
| CRM_DB_PASSWORD | Secret TODO |
| SPRING_PROFILES_ACTIVE | ConfigMap TODO (`docker`) |

Never commit Secret values. Never `kubectl apply` `secret.example.yaml`.
