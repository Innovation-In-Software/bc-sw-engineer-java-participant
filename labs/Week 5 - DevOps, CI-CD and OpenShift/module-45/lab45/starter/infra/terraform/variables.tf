variable "environment" {
  type        = string
  description = "Non-prod only: dev | test | staging"
  # TODO(lab45): validation { condition = contains(["dev", "test", "staging"], var.environment) ... }
}

variable "region" {
  type        = string
  description = "Cloud region (sketch only on the laptop path)"
  default     = "us-east-1"
}

variable "db_password" {
  type        = string
  description = "Sensitive — local tfvars or secret store; never commit. Not used by null_resource."
  sensitive   = true
  # No default — pass -var on terraform plan only (validate does not take -var).
}
