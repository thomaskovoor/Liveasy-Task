
# Liveasy Task

This is a Spring Boot application developed in Java & Spring Boot, using Maven as a build tool.The database used is Postgres SQL. The application is designed to manage loads for shippers.

## Table of Contents

- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- You have installed the latest version of Java and Maven.
- You have a Windows machine. This code may work on other platforms, but it was developed and tested on Windows.

## Installation

1. Clone the repository
```bash
git clone https://github.com/thomaskovoor/Liveasy-Task.git
```
2. Navigate to the project directory
```bash
cd Liveasy-Task
```
3. Build the project
```bash
mvn clean install
```
4. Run the project
```bash
mvn spring-boot:run
```

The application will be accessible at http://localhost:8080

The application provides the following endpoints:
- POST /api/load: Add a new load.
- GET /api/load/{shipperId}: Get all loads by shipper ID.
- GET /api/load/{loadId}: Get a load by its ID.
- DELETE /api/load/{loadId}: Delete a load by its ID.
- PUT /api/load/{loadId}: Update a load by its ID.

## Contributing
If you want to contribute to this project, please fork this repository and create a pull request.

