# Stage 1: Build the app with Maven + JDK 17
FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /app

# Copy only pom.xml first to download dependencies (speed up rebuilds)
COPY pom.xml .

RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the project, skipping tests to speed up builds
RUN mvn clean package -DskipTests

# Stage 2: Run the app with JDK 17 slim
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the jar from build stage
COPY --from=build /app/target/PortfolioWebsite-0.0.1-SNAPSHOT.jar .

# Expose port 8080 (default Spring Boot port)
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "/app/PortfolioWebsite-0.0.1-SNAPSHOT.jar"]
