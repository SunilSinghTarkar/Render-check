FROM maven:3-openjdk-17 AS build 

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17.0.2-jdk-slim
COPY  --from=build /target/demo-0.0.1-SNAPSHOT.jar damo.jar 
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar" ]