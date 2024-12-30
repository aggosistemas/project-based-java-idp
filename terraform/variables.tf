variable "aws_region" {
  description = "AWS region"
  default     = "ca-central-1"
}

variable "project_name" {
  description = "Name of the project"
}

variable "lambda_name" {
  description = "Name of the Lambda function"
}

variable "lambda_memory" {
  description = "Memory size for the Lambda function"
  default     = 512
}

variable "lambda_timeout" {
  description = "Timeout for the Lambda function"
  default     = 15
}

variable "lambda_zip_path" {
  description = "Path to the Lambda function ZIP file"
}
