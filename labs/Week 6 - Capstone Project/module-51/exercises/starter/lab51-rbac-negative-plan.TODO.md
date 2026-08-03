# RBAC negatives

| Call | Auth | Expected |
| --- | --- | --- |
| GET API | anonymous | 401 |
| mutating API | wrong role | 403 |
| GET search | valid agent | 200 + CUS-1001 |
