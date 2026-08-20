# Manifest map

| Kind | Purpose |
| --- | --- |
| Namespace | `crm-training` TODO |
| Deployment | pods + probes; image `crm-api:lab41` TODO |
| Service | ClusterIP selectors TODO |
| ConfigMap | non-secrets (`docker`, `CRM_DB_*` except password) TODO |
| Ingress | Traefik host + Host-header smoke on :8088 TODO |
| Secret (ref) | passwords out-of-band; never apply example TODO |
