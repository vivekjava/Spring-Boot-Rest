FROM openjdk:21-jdk
WORKDIR .
COPY build/libs/service-0.0.1-SNAPSHOT.jar ./
CMD ["java","-jar","actor-service-0.0.1-SNAPSHOT.jar"]