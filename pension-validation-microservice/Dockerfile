FROM openjdk:17
EXPOSE 8000
COPY . .
ADD target/pension-validation-microservice-0.0.1-SNAPSHOT.jar pension-validation-microservice-latest
ENTRYPOINT ["java","-jar","/pension-validation-microservice-latest"]