output "api_url" {
  description = "URL of the API Gateway"
  value       = "${aws_apigatewayv2_api.api_gateway.api_endpoint}"
}

output "lambda_function_name" {
  description = "Name of the Lambda function"
  value       = aws_lambda_function.lambda.function_name
}
