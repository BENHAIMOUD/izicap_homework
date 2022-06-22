FROM openjdk:11
EXPOSE 9090
ADD target/izicap_homework-docker.jar izicap_homework-docker.jar
ENTRYPOINT ["java","-jar","/izicap_homework-docker.jar"]