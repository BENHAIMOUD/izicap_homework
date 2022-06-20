# izicap_homework
This repository  contain the microservice developed the following technologies :
 `Java: Spring cloud, Spring boot, JPA, RestAPI`
 `Docker`
 
## RAIN THE APPLICATION 
 To extract Data Company from the API :http://localhost:8080/company-infos/<VOTRE_SIRET><br/>
 To download the Data extract as CSV file :http://localhost:8080/company-infos/download
 


### izicap_homework-dockerize
 To run the image o this project localy using the docker image :
 #### 1)-Build Docker Image 
 `docker build -t izicap_homework-docker.jar .`
 #### 2)-Check Docker Image
 `docker image ls`
 #### 3)-Check Docker Image
 `docker run -p 9090:8080 izicap_homework-docker.jar`<br/>
 In the run command, we have specified that the port 8080 on the container should be mapped to the port 9090 on the Host OS.
