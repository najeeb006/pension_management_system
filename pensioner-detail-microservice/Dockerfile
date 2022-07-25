FROM openjdk:17
EXPOSE 9100
COPY . .
ADD target/pensioner-detail-microservice-0.0.1-SNAPSHOT.jar pensioner-detail-microservice-latest
ENTRYPOINT ["java","-jar","/pensioner-detail-microservice-latest"]