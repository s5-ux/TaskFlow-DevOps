# TaskFlow – Java Multithreaded Task Processing System

## Overview
TaskFlow is a Java-based concurrent task processing application that demonstrates multithreading and producer-consumer architecture.

## Features
- Multithreaded task processing
- Producer-Consumer architecture
- Concurrent task execution
- Task status management
- Maven-based project management
- Automated build workflow using GitHub Actions

## Tech Stack
- Java 21
- Apache Maven
- JUnit 4
- Git and GitHub
- GitHub Actions

## Project Structure
```text
TaskFlow/
├── src/
│   ├── main/java/com/taskflow/
│   │   ├── App.java
│   │   ├── Task.java
│   │   ├── TaskProducer.java
│   │   ├── TaskConsumer.java
│   │   └── TaskManager.java
│   └── test/java/com/taskflow/
├── pom.xml
└── .gitignore
```

## How to Run

### 1. Clone the repository
```bash
git clone https://github.com/s5-ux/TaskFlow-DevOps.git
```

### 2. Navigate to project
```bash
cd TaskFlow-DevOps
```

### 3. Build the project
```bash
mvn clean package
```

### 4. Run the application
```bash
mvn exec:java "-Dexec.mainClass=com.taskflow.TaskManager"
```

## Testing
Run tests using:
```bash
mvn test
```

## Author
Sanjana Kumari

## License
This project is currently available for educational and demonstration purposes.
