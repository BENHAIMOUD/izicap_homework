# izicap_homework
This repository  contain the microservice developed the following technologies :<br/>
 `Java: Microservices, Spring boot, JPA, RestAPI, Junit & Mockito`<br/>
 `Docker`
 
## RAIN THE APPLICATION 
 To extract Data Company from the API :http://localhost:9090/company-infos/<Votre_SIRET><br/>
 To download the Data extract as CSV file :http://localhost:9090/company-infos/download <br/>
Example :<br/>
http://localhost:9090/company-infos/31302979500017<br/>
http://localhost:9090/company-infos/download
 


### izicap_homework-dockerize
 To run the image o this project localy using the docker image :
 #### 1)-Build Docker Image 
 `docker build -t izicap_homework-docker.jar .`
 #### 2)-Check Docker Image
 `docker image ls`
 #### 3)-Check Docker Image
 `docker run -p 9091:9090 izicap_homework-docker.jar`<br/>
 In the run command, we have specified that the port 9090 on the container should be mapped to the port 9090 on the Host OS.
