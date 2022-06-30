FROM gcr.io/distroless/java:8

WORKDIR /app

COPY target/*.war /app/app.war

ENTRYPOINT ["java", "-jar", "app.war"]