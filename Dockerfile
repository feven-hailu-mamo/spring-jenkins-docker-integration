FROM openjdk:8
EXPOSE 8080
ADD target/spring-jenkins-docker-integration.jar spring-jenkins-docker-integration.jar
ENTRYPOINT ["java","-jar","/spring-jenkins-docker-integration.jar"]