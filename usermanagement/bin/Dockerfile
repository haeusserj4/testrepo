
FROM maven:3.8.4-openjdk-17
WORKDIR /usermanagement
COPY . .
RUN mvn clean install
CMD mvn spring-boot:run

EXPOSE 8081