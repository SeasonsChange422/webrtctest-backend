FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY /target/websocket_server-2.4.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
