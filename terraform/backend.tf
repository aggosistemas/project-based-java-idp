terraform {
  backend "s3" {
    bucket         = "bucket-tfstate-toinho"
    key            = "idp/infra/projectjava/terraform.tfstate"
    region         = "ca-central-1"
  }
}