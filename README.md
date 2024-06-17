
# Backend Concepts
Before you begin, ensure you have the following installed on your local machine:

- Java Development Kit (JDK) 11 or later
- Apache Maven 3.6.3 or later


## Configuration

The application requires specific configuration settings to connect to the database. These settings should be specified in the application.properties file located in the src/main/resources directory.

# Example Configuration

```bash
spring.application.name=student-records
spring.datasource.url=jdbc:mysql://localhost:3306/my_database
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```



## Run Locally

Clone the project

```bash
git clone https://github.com/aakankshadhurandhar/backend-concepts.git
```

Go to the project directory

```bash
  cd backend-concepts
```

Install dependencies

```bash
  mvn clean install
```

Start the server

```bash
  mvn spring-boot:run

```

