FROM openjdk:17-oracle
EXPOSE 7777
ARG JAR_FILE=build/libs/pofect-config-server-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
