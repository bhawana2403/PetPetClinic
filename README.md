# PetPetClinic
## Running PetPetClinic Application locally
Petclinic is a Spring Boot application built using Maven. You can build a jar file and run it from the command line (it should work just as well with Java 8, 11 or 17):

git clone https://github.com/PetPetClinic.git
___
*cd PetPetClinic*

./mvnw package

 *java -jar target/*.jar
___

You can then access petclinic here: http://localhost:8080/users
![dashboard](https://user-images.githubusercontent.com/47191934/141693916-c6a5e00e-6920-4963-8a8f-26859191713b.jpg)

## Database Configuration
In its default configuration, PetPetclinic uses an in-memory database (H2) which gets populated at startup with data. The h2 console is automatically exposed at http://localhost:8080/h2-console and it is possible to inspect the content of the database using the jdbc:h2:mem:testdb url.

## Working with Petclinic in your IDE
### Prerequisites

*The following items should be installed in your system:*

* Java 8 or newer (full JDK not a JRE).
* git command line tool (https://help.github.com/articles/set-up-git)
* Your preferred IDE
* Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in Help -> About dialog. If m2e is not there, just follow the install process here: https://www.eclipse.org/m2e/
* Spring Tools Suite (STS)
* IntelliJ IDEA
* VS Code

#### Steps:
On the command line

git clone https://github.com/PetPetClinic.git
Inside Eclipse or STS

File -> Import -> Maven -> Existing Maven project
Then either build on the command line ./mvnw generate-resources or using the Eclipse launcher (right click on project and Run As -> Maven install) to generate the css. Run the application main method by right clicking on it and choosing Run As -> Java Application.

Inside IntelliJ IDEA In the main menu, choose File -> Open and select the PetPetClinic pom.xml. Click on the Open button.

CSS files are generated from the Maven build. You can either build them on the command line ./mvnw generate-resources or right click on the PetPetClinic project then Maven -> Generates sources and Update Folders.

A run configuration named PetPetClinicApplication should have been created for you if you're using a recent Ultimate version. Otherwise, run the application by right clicking on the PetPetClinicApplication main class and choosing Run 'PetPetClinicApplication'.

Navigate to PetPetClinic

Visit http://localhost:8080 in your browser.
