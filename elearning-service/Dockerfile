FROM ghcr.io/graalvm/jdk-community:25
WORKDIR /extracted
ADD ./build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "app.jar"]