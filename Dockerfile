FROM maven:3.9.4-eclipse-temurin-21-alpine AS builder

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline
COPY src src

RUN mvn package

FROM openjdk:21-jdk

WORKDIR /app

COPY --from=builder /app/target/transaction-service-0.0.1.jar .

EXPOSE 8080

CMD ["java", "-jar", "transaction-service-0.0.1.jar"]
