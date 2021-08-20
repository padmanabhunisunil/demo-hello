FROM openjdk:16
ADD target/docker-demohello.jar docker-demohello.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-demohello.jar"]