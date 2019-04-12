# \#GoGreen
### A project made by Area22

## How to import into your IDE

Eclipse:
[http://javapapers.com/java/import-maven-project-into-eclipse/](http://javapapers.com/java/import-maven-project-into-eclipse/)

Intellij:  
[https://www.jetbrains.com/help/idea/2016.2/importing-project-from-maven-model.html](https://www.jetbrains.com/help/idea/2016.2/importing-project-from-maven-model.html)

## How to run on your machine

### IDE
If you want to run the client from your IDE, you will need to import the Maven project from the ```src/Client/pom.xml``` file.
Then, you only need to run the GUI_App.java class, which you will find in the client's ```src/main/java/GUI``` folder.

### JAR
If you want to run the app from a JAR file, after importing the ```src/Client/pom.xml``` project you will need to run this command:
```mvn package```
Then, you will find the JAR file in the ```target``` folder.

## Running the whole project on your computer

You will need to replace the code in:
```src/Server/TestServer/src/main/resources/persistence-mysql.properties```
```src/Client/src/main/java/helper/ServerConfig.java```
With the commented-out replacement code.

Then, you will need a running Tomcat instance and a running MySQL instance.

Finally, you will need to create a database called ```testdatabase``` and run the commands specified in the ```src/Server/TestServer/src/main/resources/SQLconfig.txt``` file. 

After that, you can run ```mvn package -DskipTests``` on both projects, which will give you a WAR file you can load in Tomcat (server project), and a JAR file for the client.

## Names and student numbers

### Ardy Zwanenburg
Student number: 4856848
<p>In my opinion orginasation and control are my strongest points. I like to start a new projet and than while doing it and it becomes bigger than others slowly take
some task over from me so that I do not do too much myself. In groups work this mostly shows up at the start of the project and in the end it will look like I did
less.</p>
<p>One of my weaker points is than of course given tasks away. Most of the times I will end up doing every task I came up with myself in stead of giving it to one of
the other team mebers.</p>
<p>As a core quadrant example: If I take too many taks for myself some will end up not done and that will end up in a worse project result. If I do not give enhough tasks
I am afraid the other just wait and sit out until the last day and then all start last moment speedcoding with a lot of mistakes.<p/>
<p>G - Goal: My goal is to be a better lazier programmer, everything has been done before so why inventing the wheel again if someone else already did it. I also want to
learn how to program better thinking about growing. Like a bycicle store that later also wants to sell scooters. In that way I become a better and well orginised programmer.
The goal is a succes if we put down a usable product without not using any liberys. R - Reality: I am activily looking for information how other programmers use a server and
a client in their application and how I can use some of it in my own program. In that way I am getting to my goal. O - Options: With stack overflow there is a lot of code, most
of it is usefull something. Now I have to investigate wich one is doing the trick for me. That is also the hard part, not everything that is there is usefull for me. W - Will 
My main will is that I want to work on the project the same amount as time as my team mates. It is a teameffort and in my opinion we should work all the same amount of time. Not
how much one did, but how long. So that if you get stuck you not automatically did less, because he tried. My team mates can help me reaching this goal to openly say what they
are doing and how long it took.</p>
<p> <img src=img/aZwanenburg.jpg alt="Photo of Ardy Zwanenburg" width="300" height="400"> </p>

### Jari van den Broek
Student number: 4932749
I think my two strong points are oversight and communication, I like to keep track of everything and this is always a valuable part of teamwork.
I think my two weak points are overal knowledge and skills with coding, this will make getting into the flow and getting started with new coding quite hard.
It will really be a challenge for me actually code a real application.
Goals:
I hope to learn how to connect the server with an application and I want to see how I can make a nice GUI.
I will have succeeded in this goal, when we have a nicely working GUI and good server communication.
Reality:
Looking at a lot of video's and a lot of code on these subjects
Options:
I think Google and Youtube will be my biggest friends these coming weeks to actually make my goals.
Will:
I am going to try and work with my team to improve my coding skills the coming weeks and ill be focusing on this during the weekends and the project hours
The first concrete step I can take is attenting all project hours.
<p> <img src=img/Jari.jpg alt="Photo of Jari van den broek" width="300" height="400"> </p>

### Johannes Hagspiel
Student number 4910109

My goal is to learn about server-client communication and about Scrum. Additionally, I want to try to include all the things that I have learned previously like the database and the web technology aspects. My weaknesses are explaining things and my impatience. I hope that I can use what I have previously learned about project management for this project. To learn more about server-client communication and Scrum, I want to volunteer for these parts. These goals are important to me because I think project management skills are valuable and rare. Server-client communication is a key element of modern software and thus being proficient in using it is why I want to learn more about it. Overall, learning more about the various tools and programs used in Java software engineering is what I want to focus on. 
<p> <img src=img/jhagspiel_photo.JPG alt="Photo of Johannes Hagspiel" width="253"  height="327"> </p>

### Lukas Zimmerhackl
Student number: 4904176
I want to learn how to work in a group environment, learn to work with git and I want to learn how to create real application. I also want to learn to stick to a schedule, since that is something i have had difficulty with. Im trying to achieve this by sticking to the schedule we make during the lab sessions and i think I still need to improve more. My teammates can help me achieve this by making concrete goals and telling me that i don't do well if i dont make an appiontment. I've tried multiple times in highschool to stick to a scedule, but found out I could also make it not using a scedule. Since this course grades you on using a scedule I am going to have to improve.
<p> <img src=img/lZimmerhackl.jpg alt="Photo of Lukas Zimmerhackl" width="300" height="400"> </p>

### Nick van Riet
Student number: 4868900
With this project, my main goal is to gain experience with working as a team, including any tools (GitLab, etc.). Furthermore, I also want to further develop my programming skills and broaden my knowledge of existing resources (libraries, software, etc.). 
My first strong point is that I'm very eager to gain new knowlegde and learn about the new programs we are going to use. This will allow me to quickly addapt to using new software and exploring the libraries we might need. My second strong point is dedication. This will allow me to achieve goals as efficient and as good as possible.

To achieve these goals, I will do my best to actively communicate with my team: helping others when I can and asking for help when needed.
<p> <img src=img/NickvanRiet.jpg alt="Photo of Nick van Riet" width="300" height="400"> </p> 

### Nathan Ordonez
Student number: 4936205
-- Step 1 -- Two of my strong points are probably my prior experience with Java projects, when I designed a Steganography program as well as worked on a video game, otherwise generally my experience with fiddling around with the terminal, which stems from me trying to install Linux on all my computers as a kid, and trying to make different services such as FTP work on them. Both of these are not examples from a group environment, but one can clearly see the benefit. \
As for my weaker points, I think I will have to strive to become better at communicating my work, asking for help when I need it (which has been a problem during the OOP Assembly project) as well as actively searching for teammates who need help. (same example). This has led to cramming at the latest lab session.
Next, for my core quadrant, I will write it in this form: Core  Quality -- Pitfall -- Challenge -- Allergy
Experience, practice -- underestimating the workload -- work consistently and early on -- untidyness and disorganization

-- Step 2 -- GROW \
G - Goal - To learn proper Git and Maven and to learn how to properly work following the Agile framework. \
R - Reality - I've learned how to work using Sourcetree but I was unable to even clone using the terminal Git. The fact that I completed this deadline shows that I am making progress towards my goals. \
O - Options - One option is to keep doing as I'm doing, which is experimenting on my computer and searching on Google. Another option is to start working with my teammates and asking them for advice.
Both options are of interest to me, and the only thing stopping me is myself.
W - Will - I am going to work harder, study harder, and communicate better, ASAP, and a good first step is to check in with my group to make sure my Development Plan is approved by them. They can help me with their opinions. \
Some concrete steps for attaining my goals are, each week, to plan working time, schedule some of it with my team, and make sure that I stick to it.
<p> <img src=img/NathanOrdonez.jpg alt="Photo of Nathan Ordonez" width="300" height="400"> </p>