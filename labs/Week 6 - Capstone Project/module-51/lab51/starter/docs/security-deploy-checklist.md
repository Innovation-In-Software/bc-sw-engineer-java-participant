# Lab 51 — security & deploy checklist (session block)

Fixtures in smoke only: `CUS-1001` · `CUS-1002` · `lab-request-001` · image `crm-api:<version>-<gitsha>`

## Threat / control sketch

| Asset | Threat | Control (session note) | Evidence later |
| ----- | ------ | ---------------------- | -------------- |
| Interaction API | Anonymous write | JWT + deny-by-default | 401 curl |
| Agent role | Privilege abuse | Method/role rules | 403 curl |
| Secrets | Leak in logs/images | No secrets in Dockerfile / GH secrets | scan report |
| Image | Tamper / drift | Digest tag | pipeline artifact |
| Cluster | Bad rollout | Probes + rollback | kubectl events |

## Gates (mark session vs full)

- [ ] AuthN/Z tests green (full)
- [ ] Dependency / secret / image scan reviewed (full)
- [ ] Pipeline stages documented (full)
- [ ] Dockerfile multi-stage non-root (session stub → full build)
- [ ] k8s probes + resources (session stub → apply on k3s)
- [ ] Authenticated smoke for `POST /api/v1/interactions` + `CUS-1001` (full)
- [ ] Unauthorized 401 + wrong-role 403 (session notes OK)
- [ ] Rollback to previous digest rehearsed (full)

## Smoke matrix (draft commands)

```powershell
# TODO: replace BASE_URL and TOKEN. Primary smoke is POST create — not GET /api/customers/{id}.
curl.exe -sS -o NUL -w "%{http_code}" -X POST "$BASE_URL/api/v1/interactions" -H "Content-Type: application/json" -d "{}"
# expect 401 when JWT is on
# AGENT + valid body → 201; wrong role on a MANAGER-only route → 403
```

## Rollback note

Previous digest: `crm-api@sha256:_____`  
Rollback command: `kubectl set image …=crm-api@sha256:_____` (or your GitOps path)
