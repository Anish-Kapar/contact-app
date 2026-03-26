FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY src/main/java/com/example/contactapp .

RUN chmod +x mvnw
RUN ./mvnw clean package

EXPOSE 8080

CMD ["java", "-jar", "target/contactapp-0.0.1-SNAPSHOT.jar"]