<img src=img/green_thumb_logo.png alt="The Green Thumb Logo" width="252" height="216">

--------------------------------------------------------------------------------
[![MIT License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/johanneshagspiel/green-thumb/LICENSE)
[![Top Language](https://img.shields.io/github/languages/top/johanneshagspiel/the-green-thumb)](https://github.com/johanneshagspiel/green-thumb)
[![Latest Release](https://img.shields.io/github/v/release/johanneshagspiel/the-green-thumb)](https://github.com/johanneshagspiel/green-thumb/releases/)

# The Green Thumb

"The Green Thumb" is a CRUD application written in Java that allows the user to keep track of their CO2 consumption. It was implemented in the [Client](https://github.com/johanneshagspiel/the-green-thumb/tree/main/src/client)-[server](https://github.com/johanneshagspiel/the-green-thumb/tree/main/src/Server/TestServer) model, between which the communication occurs via a REST API. The server is based on the [SPRING framework](https://spring.io/) and uses [Hibernate](https://hibernate.org/) to map the requests to the [MYSQL database](https://www.mysql.com/). The codebase for both the client and the server was thorhoughly tested using testing frameworks such as [Mockito](https://site.mockito.org/).

## Features

With "The Green Thumb", the user:

- gains or loses points depending on the actions they take such as the kind of meal they eat, what kind of produce they buy or by which means of transportation they travel.
- can connect with friends and communicate with them via the chat.
- is incentivized to improve their behavior via the leaderboard as well as the various achievements they can obtain for certain repeated actions such as buy multiple solar panels. 

## Installation Process

To run "The Green Thumb", first a local instance of the [server](https://github.com/johanneshagspiel/the-green-thumb/tree/main/src/Server/TestServer) has to be initialized. It is assumed that both Java and an IDE such as IntelliJ are installed.

- Download and install the latest version of [MYSQL](https://dev.mysql.com/downloads/) and of [Apache Tomcat](https://tomcat.apache.org/).
- Make sure that a MYSQL connection is created using the hostname "localhost" and the port "3306".
- Run the entire [startup script](https://github.com/johanneshagspiel/the-green-thumb/blob/main/src/Server/TestServer/sql-script/startup_script.sql) in MYSQL.
- Import the [server](https://github.com/johanneshagspiel/the-green-thumb/tree/main/src/Server/TestServer) as a Maven project and resolve all dependencies.
- Run the maven lifecycle command "package" with the "Skip Tests" mode toggled on. This should create a new folder called "target" with, among other things, a file called "spring-crm-rest.war". 
- Deploy the new "spring-crm-rest.war" file in the Tomcat server i.e. by moving it into the Tomcat Webapp folder. Make sure that the Tomcat server runs on port "8082".

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

"The Green Thumb" is published under the MIT licence, which can be found in the [LICENSE](LICENSE) file.
