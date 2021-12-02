FROM openjdk:8-jdk-alpine
RUN echo "Asia/Shanghai" > /etc/timezone
COPY ./target/*.jar docker-demo.jar
ENTRYPOINT ["java","-jar","docker-demo.jar"]

## https://www.baeldung.com/dockerizing-spring-boot-application