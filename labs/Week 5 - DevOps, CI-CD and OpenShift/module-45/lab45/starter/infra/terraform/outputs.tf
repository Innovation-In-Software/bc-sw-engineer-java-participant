output "environment" {
  value = var.environment
}

output "region" {
  value = var.region
}

output "sketch_note" {
  value = "TODO(lab45): Replace null_resource with real modules after human threat review; never apply to Lab 42 k3d as homework."
}

# TODO(lab45): Output non-secret endpoints only (no passwords)
