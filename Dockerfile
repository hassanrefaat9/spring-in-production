FROM openjdk:17-alpine
MAINTAINER nerd.com
RUN addgroup -S mygroup && adduser -S myuser -G mygroup
USER myuser:mygroup
ARG JAR_FILE=build/libs/spring-in-prod-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
