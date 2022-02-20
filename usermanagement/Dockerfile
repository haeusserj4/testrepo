

#FROM openjdk:11

#EXPOSE 8081

#ADD target/usermanagement-0.0.1.jar usermanagement-0.0.1.jar

#ENTRYPOINT ["java","-jar","usermanagement-0.0.1.jar"]

FROM maven:3.8.4-openjdk-17
WORKDIR /usermanagement
COPY . .
RUN mvn clean package -DskipTests
EXPOSE 8081
CMD mvn spring-boot:run