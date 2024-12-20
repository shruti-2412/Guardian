# Guardian Spring Boot Project

### Prerequisites
- Java JDK 8 or later
- IntelliJ IDE
- Git Bash

### Steps to Run the Spring Boot Project

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/shruti-2412/Guardian.git
   cd Guardian
   ```

2. **Setup the Environment**:  
   Ensure you have Java JDK 8 or later and Maven installed. You can verify the installations with:
   ```sh
   java -version
   mvn -version
   ```
   Make sure to edit the project configurations properly with the correct JDK version.

3. **Build the Project**:  
   Use Maven to build the project:
   ```sh
   mvn clean install
   ```

4. **Run the Application**:  
   You can run the Spring Boot application 

5. **Access the Application**:  
   Open your web browser and navigate to `http://localhost:8080` to access the application.

   
### Lombok Dependency issue (request params are null)

If you are facing an issue with the Lombok library check if the following steps are completed in the IntelliJ

- Enable Annotation Processing:  
Make sure annotation processing is enabled in IntelliJ IDEA. Go to File > Settings > Build, Execution, Deployment > Compiler > Annotation Processors and check the box for Enable annotation processing.

- Check Lombok Plugin Version:  
Ensure that you have the latest version of the Lombok plugin installed. You can check for updates in File > Settings > Plugins. After installing the Lombok plugin, restart IntelliJ IDEA to ensure the changes take effect.

- Maven Configuration:  
If you're using Maven, make sure the Lombok dependency is correctly included in your pom.xml. Also, use the mvn clean install to build the project
