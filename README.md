# Transaction service

The service provides a REST API to:
• book money (positive/negative) as a transaction
per customer per tenant
• rollback (void) a money transaction per customer per tenant
• fetch recent transactions per customer and tenant

Service provides an audit log (e.g., who changed what when?)and persist the data into a database

# How to run

`docker compose up`

# API

POST http://localhost:8080/transactions/book
POST http://localhost:8080/transactions/rollback
GET http://localhost:8080/transactions/list