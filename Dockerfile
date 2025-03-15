FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/new-spring-rest-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java","-ja-r" ,"app.jar"]