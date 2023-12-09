FROM openjdk:17-jdk-slim
EXPOSE 8060
ADD target/gestion-ecole-jar.jar gestion-ecole-jar.jar
ENTRYPOINT ["java", "-jar", "/docker-jenkins-integration-sample.jar"]
