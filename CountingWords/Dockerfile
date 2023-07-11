FROM openjdk:17

WORKDIR /dockerapp
COPY . /dockerapp

EXPOSE 8080

CMD ["java", "-jar", "build/libs/CountingWords-0.0.1-SNAPSHOT.jar"]