FROM maven:3.8.3-openjdk-17
WORKDIR /home/app
COPY . .
EXPOSE 8080
ENTRYPOINT ["mvn","spring-boot:run"]
