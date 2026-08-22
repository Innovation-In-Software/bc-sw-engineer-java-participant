terraform {
  required_version = ">= 1.5.0"
  required_providers {
    # Pin ranges. Replace null with a cloud/kubernetes provider only in an authorized sandbox.
    null = {
      source  = "hashicorp/null"
      version = "~> 3.2"
    }
  }
  # TODO(lab45): Remote-state narrative in docs/ai-iac-review.md — never commit state or backend keys.
  # backend "s3" { … }  # credentials via env / OIDC, not Git
}
