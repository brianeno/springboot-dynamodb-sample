provider "aws" {
  region = "us-east-1"   // You can replace this with your desired AWS region.
}

// Define a resource of type 'aws_dynamodb_table'
resource "aws_dynamodb_table" "session-table" {
  name           = "chargesession-log"    // Name of the table
  hash_key       = "Id" // The attribute to use as the hash (partition) key
  billing_mode   = "PAY_PER_REQUEST"

  // Define the attribute definitions
  attribute {
    name = "Id"
    type = "S"
  }
  tags = {
      environment       = "dev"
   }
}

