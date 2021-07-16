# Hello Cloud

## Lab1
### deploy "hello cloud" to Azure App Service
  - https://docs.microsoft.com/en-us/azure/app-service/quickstart-java?pivots=platform-linux&tabs=javase
#### maven command
- prepare and verify spring-boot project
  - test 
    `./mvnw spring-boot:run`
  - start local server
    `./mvnw spring-boot:run` and open http://127.0.0.1:8080
  - package
    `./mvnw package spring-boot:repackage`

- configuration and deploy to Azure 
  - login az
    `az login --use-device-code`
  - configuration
    `./mvnw com.microsoft.azure:azure-webapp-maven-plugin:2.0.0:config`
  - deploy
    `./mvnw package spring-boot:repackage azure-webapp:deploy`
#### Azure Env
- resource group : hello-cloud
- app service
  - name: hello-cloud-kenneth
  - location East Asia
  - service plan: F1, Free, Shared (60 CPU minutes / day) (Ram 1G) (Storage 1G)
  - end point: https://hello-cloud-kenneth.azurewebsites.net/
  