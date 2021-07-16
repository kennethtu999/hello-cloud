# Hello Cloud

## Lab1
- deploy "hello cloud" to Azure App Service
- Azure Env & Resource
  - resource group : hello-cloud
  - location East Asia
  - name: hello-cloud-kenneth
  - resource type: App Service
    - service plan: F1, Free, Shared (60 CPU minutes / day) (Ram 1G) (Storage 1G)
    - end point: https://hello-cloud-kenneth.azurewebsites.net/
  - ref
    - create create and deploy app service
      - https://docs.microsoft.com/en-us/azure/app-service/quickstart-java?pivots=platform-linux&tabs=javase

### Step 1. prepare 
1. open **hello-root/pom.xml**
2. change property **az.appname** as uniquie name on Azure

### Step 2. verify spring-boot project
- unit test 
  `./mvnw test -f hello-root/hello-restfulapi/pom.xml`
- test on local server
  1. start server `./mvnw spring-boot:run -f hello-root/hello-restfulapi/pom.xml` 
  2. open http://127.0.0.1:8080

### Step 3. configuration and deploy to Azure 
  - login az
    `az login --use-device-code`
  - configuration (ignore thie)
    `./mvnw com.microsoft.azure:azure-webapp-maven-plugin:2.0.0:config -f hello-root/hello-restfulapi/pom.xml`
  - deploy
    `./mvnw package spring-boot:repackage azure-webapp:deploy -f hello-root/hello-restfulapi/pom.xml`
