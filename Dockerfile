FROM amazoncorretto:11-alpine-jdk
MAINTAINER MEC
COPY target/mec-0.0.1-SNAPSHOT.jar mec-app.jar
ENTRYPOINT ["java","-jar","/mec-app.jar"]