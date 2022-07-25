FROM openjdk:17
EXPOSE 9080
COPY . .
ADD target/pension-management-portal-0.0.1-SNAPSHOT.jar pension-management-latest
ENTRYPOINT ["java","-jar","/pension-management-latest"]