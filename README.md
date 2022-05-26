<img src=img/green_thumb_logo.png alt="The Green Thumb Logo" width="252" height="216">

--------------------------------------------------------------------------------
[![MIT License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/johanneshagspiel/green-thumb/LICENSE)
[![Top Language](https://img.shields.io/github/languages/top/johanneshagspiel/the-green-thumb)](https://github.com/johanneshagspiel/green-thumb)
[![Latest Release](https://img.shields.io/github/v/release/johanneshagspiel/the-green-thumb)](https://github.com/johanneshagspiel/green-thumb/releases/)

# The Green Thumb

"The Green Thumb" is a CRUD application written in Java that incentivizes behavior that leads to less CO2 consumption. It was implemented in the Client-Server model, of which both parts can be found in this repository.

## Features

With "The Green Thumb", the user:

- gains or loses points depending on the actions they take such as the kind of meal they eat, what kind of produce they buy or by which means of transportation they travel.
- can connect with friends and communicate with them via the chat.
- is incentivized to improve their behavior via the leaderboard as well as the various achievements they can obtain for certain repeated actions such as buy multiple solar panels. 

## Tools

| Purpose                     | Name                                                                      |
|-----------------------------|---------------------------------------------------------------------------|
| Programming language        | [Java](https://openjdk.org/)                                              |
| Dependency manager          | [Maven](https://maven.apache.org/)                                        |
| Version control system | [Git](https://git-scm.com/)          |
| Testing frameworks          | [JUnit](https://junit.org/junit5/), [Mockito](https://site.mockito.org/)  |
| Server framework            | [SPRING](https://spring.io/)                                              |
| Database                    | [MYSQL](https://www.mysql.com/)                                           |
| Database interaction        | [JDBC](https://en.wikipedia.org/wiki/Java_Database_Connectivity)     |
| Object–relational mapping   | [Hibernate](https://hibernate.org/)                                       |
| Client-server communication | [REST-API](https://en.wikipedia.org/wiki/Representational_state_transfer) |

## Installation Process

To run "The Green Thumb", first a local instance of the [server](https://github.com/johanneshagspiel/the-green-thumb/tree/main/src/Server/TestServer) has to be initialized. It is assumed that both a [Java JDK](https://openjdk.org/) and an IDE such as [IntelliJ](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/ide/) are installed and that the users operating system is Windows.

- Download and install the latest version of [MYSQL](https://dev.mysql.com/downloads/) and of [Apache Tomcat](https://tomcat.apache.org/).
- Make sure that a MYSQL connection is created using the hostname "localhost" and the port "3306".
- Run the entire [startup script](https://github.com/johanneshagspiel/the-green-thumb/blob/main/src/Server/TestServer/sql-script/startup_script.sql) in MYSQL.
- Import the [server](https://github.com/johanneshagspiel/the-green-thumb/tree/main/src/Server/TestServer) as a Maven project and resolve all dependencies.
- Run the maven lifecycle command "package" with the "Skip Tests" mode toggled on. This should create a new folder called "target" with, among other things, a file called "spring-crm-rest.war". 
- Exploded deploy the new "spring-crm-rest.war" file in the Tomcat server i.e. by moving it into the Tomcat Webapp folder. Make sure that the Tomcat server runs on port "8082".

Now, the client can be started.

- Import the [client](https://github.com/johanneshagspiel/the-green-thumb/tree/main/src/client) as a Maven project and resolve all dependencies.
- Run the client by executing the main method in the [Application class](https://github.com/johanneshagspiel/the-green-thumb/tree/main/src/client/src/main/java/gui/Application.java).

## Contributors

This app was developed using the [SCRUM methodology](https://www.scrum.org/resources/what-is-scrum) together with:

- [Ardy Zwanenburg](https://github.com/ArdyZ)
- [Jari van den Broek](https://github.com/jarivdbroek12)
- [Nathan Ordonez](https://github.com/nataxcan)
- Lukas Zimmerhackl
- Nick van Riet

## Licence

"The Green Thumb" is published under the MIT licence, which can be found in the [LICENSE](LICENSE) file. For this repository, the terms laid out there shall not apply to any individual that is currently enrolled at a higher education institution as a student. Those individuals shall not interact with any other part of this repository besides this README in any way by, for example cloning it or looking at its source code or have someone else interact with this repository in any way.
