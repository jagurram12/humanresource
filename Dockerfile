FROM java:8-jdk-alpine
COPY target/humanresource-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","humanresource-0.0.1-SNAPSHOT.jar"]