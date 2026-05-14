# Azure DevOps Maven Demo

This is a beginner-friendly Java Maven project for demonstrating Azure DevOps CI/CD.

## Folder Structure

```text
azure-devops-maven-demo/
├── azure-pipelines.yml
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               └── App.java
    └── test
        └── java
            └── com
                └── example
                    └── AppTest.java
```

## Prerequisites

- Java 17
- Maven 3.8 or newer

## Run Locally

Compile the project:

```bash
mvn clean compile
```

Run tests:

```bash
mvn test
```

Build and test the project:

```bash
mvn clean install
```

Run the application after building:

```bash
java -cp target/azure-devops-maven-demo-1.0.0.jar com.example.App
```

## Azure DevOps Pipeline

The `azure-pipelines.yml` file:

- Triggers on the `main` branch
- Uses the `ubuntu-latest` Microsoft-hosted agent
- Uses the Azure DevOps `Maven@4` task
- Runs `mvn clean install`
- Publishes JUnit test results from Maven Surefire reports

# maven
