# hello-cloud

## start craft
- dev env
  - https://code.visualstudio.com/docs/java/java-webapp
- springboot project
  - https://start.spring.io/
### maven command
- test 
`./mvnw spring-boot:run`
- start local server
`./mvnw spring-boot:run`

### final azure env
- resource group : hello-cloud
- app service
  - name: hello-cloud-kenneth
  - location East Asia
  - service plan: F1, Free, Shared (60 CPU minutes / day) (Ram 1G) (Storage 1G)
  - end point: https://hello-cloud-kenneth.azurewebsites.net/