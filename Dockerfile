FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy FULL project (important)
COPY . .

# Give permission to mvnw
RUN chmod +x mvnw

# Build project
RUN ./mvnw clean package

EXPOSE 8080

CMD ["java", "-jar", "target/contactapp-0.0.1-SNAPSHOT.jar"]