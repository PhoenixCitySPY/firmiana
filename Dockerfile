FROM openjdk:17-slim

COPY firmiana-backend/target/firmiana-backend-0.0.1-SNAPSHOT.jar firmiana-backend.jar

ENTRYPOINT ["java", "-jar", "/firmiana-backend.jar"]
