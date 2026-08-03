# Sargability

Bad: `WHERE TRUNC(created_at) = CURRENT_DATE`
Good: half-open range TODO

Bad: `WHERE LOWER(email) = ...` without support
Good: TODO normalized column / rewrite
