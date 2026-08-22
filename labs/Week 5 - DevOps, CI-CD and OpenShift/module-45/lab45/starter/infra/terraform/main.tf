# Lab 45 — CRM infra sketch (local validate/plan without cloud apply)
# TODO(lab45): Replace null_resource with VPC/DB/runtime only in an authorized sandbox.
# FORBIDDEN: public database, hardcoded passwords, 0.0.0.0/0 SSH/DB, environment=prod apply.

locals {
  tags = {
    application = "crm"
    environment = var.environment
    managed_by  = "terraform"
    # TODO(lab45): cost-center / student id tags per instructor
  }
}

resource "null_resource" "crm_stack_sketch" {
  triggers = {
    environment = var.environment
    region      = var.region
  }
  # TODO(lab45): Document that a real DB must be private-subnet only (no public IP).
}
