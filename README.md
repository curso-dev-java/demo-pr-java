# Demo PR Java Project

Colaborador: akobashikawa2023
Colaborador: Hugo Exebio
This is a demo project for Java that uses Maven as the build tool, JDK 17 for the Java version, and JUnit 5 for testing.

## Project Structure

```
demo-pr-java
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── App.java
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── AppTest.java
├── pom.xml
└── README.md
```

## Requirements

- JDK 17
- Maven

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="com.example.App"
```

## Running Tests

To run the tests, use the following command:

```
mvn test
```

This will execute the test cases defined in `AppTest.java` using JUnit 5.
