FROM openjdk:17

WORKDIR /app

COPY target/monolith_demo.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]