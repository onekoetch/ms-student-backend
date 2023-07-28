FROM openjdk:17-alpine
# For Java 11, try this
FROM fabric8/java-alpine-openjdk11-jre:1.9.0
EXPOSE  8090


ARG JAR_FILE=target/ms-student-backend-0.0.1-SNAPSHOT.jar 

# cd /opt/app
WORKDIR /opt/app

COPY ${JAR_FILE} app.jar


ENTRYPOINT ["java","-jar","app.jar"]

