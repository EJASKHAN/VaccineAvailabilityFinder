FROM maven:3.6-jdk-8-slim AS builder
COPY . ./src/app
WORKDIR /src/app
RUN mvn clean install

FROM java:8-jdk-alpine
COPY --from=builder /src/app/target/VaccineAvailabilityFinder-*dependencies.jar /usr/app/app.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]