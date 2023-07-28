FROM openjdk:17-alpine

LABEL maintainer="AWERIMO@safaricom.co.ke"

EXPOSE 8090

VOLUME /tmp

ADD target/ms-student-backend-0.0.1-SNAPSHOT.jar   ms-student-backend
RUN /bin/sh -c 'touch /ms-student-backend.jar'


RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ENTRYPOINT ["java","-Xmx256m", "-XX:+UseG1GC", "-Djava.security.egd=file:/dev/./urandom","-jar","/ms-student-backend.jar"]
