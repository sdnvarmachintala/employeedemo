## Overview
This is a Spring Boot application designed to build a robust application that includes the following REST APIs. 
These APIs will be used for managing employee details and calculating tax deductions. 

We are having two API end points -

1. POST - api/employeedetails - Given the JSON body and inserts the data into two tables employee and phone_details.
2. GET - api/employeedetails/{id}/tax-deductions - Takes the enployee id as the parameter in the URL and gets the tax deduction of that particular employee.

## Prerequisites
Before you begin, ensure you have met the following requirements:
- Java 8+ or newer
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse, etc.) 

## Configuring and Running the application

Step 1:
 go to https://start.spring.io/ site.
 Step 2:
 Add the dependencies that we need.
 1. Spring Web
 2. Spring Data JPA
 3. Spring Security
 4. Validation
 5. Mysql Driver
 6. Spring Boot Dev Tools

Step 3:
Select the values for Project,Language and Spring Boot values. Add the values for Group, Artifact, Name and Description and click on generate button which will download the zip format of your spring boot application.

Step 4:
Unzip the folder and import the folder into the eclipse like existing maven project.

Step 5:
Once after importing the folder we will see the src folder and pom.xml file in the application. Replace those with ones that are in the below repository. 

Step 6:
To clone the repository, run the following command in your terminal:
git clone https://github.com/sdnvarmachintala/employeedemo.git

Step 7:
Change the DB credentials in application.properties file.Import the .sql file in the repo to create the tables that are needed.

Step 8:
Maven will install all the dependencies in the pom.xml. Once after run your application from the IDE.
 
mvn clean install - Bash command to clean and install the spring boot application
mvn spring-boot:run - Bash command to run the spring boot application

Step 9:
Once the application is up and running, you can access the web service API at http://localhost:8080. You can use tools like Postman or cURL to interact with the REST endpoints given in the overview section.



