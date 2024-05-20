This project contains automated tests for the user management API provided by [Reqres](https://reqres.in. It uses Karate for test execution and Cucumber for report generation.
Requeriments and dependencies
- Java: 8 o superior
- Gradle: 3.6.3 o superior
- karate-junit5:1.2.0.RC4
- cucumber-reporting:5.7.0
- junit-bom:5.9.1

##Step-by-Step Setup
Install JDK 11+:
Download and install from the Oracle website.

Install Gradle 6+:
Follow the instructions on the Gradle website.

Clone the Repository:

bash
Copy code
git clone https://github.com/VICTORPER/softkatest.git
cd softkatest
Build the Project:

bash
Copy code
./gradlew build
Run the Tests:

bash
Copy code
./gradlew test

Running the Project
To run the project using the runner, use the following command:

bash
Copy code
./gradlew run

IDE

Open your project in your IDE (for example, IntelliJ IDEA, Eclipse with the Gradle plugin).
Navigate to the class ManagmentTest.
Right-click on the class or the method testParallel.
Select the option "Run" or "Debug" depending on whether you want to run it in debug mode.
