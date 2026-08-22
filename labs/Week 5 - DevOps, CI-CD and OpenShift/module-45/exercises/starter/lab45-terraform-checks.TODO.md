# Terraform checks

1. terraform fmt
2. terraform init -backend=false
3. terraform validate  (NO -var)
4. terraform plan -var=environment=dev -var=db_password=unused-local  (read; do not apply)
5. Never commit: *.tfstate, real tfvars, keys
