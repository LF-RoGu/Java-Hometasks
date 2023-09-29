
# Java Home Task #2

IDE -> IntelliJ

Run Intructions:
1.- Open the file location where it is stored.
2.- Open terminal
 a) Windows
   a.1) Write 'CMD' on the file explorer to open the terminal on that exact location
 b) Linux
   b.1) Ctrl + T (most common one)
   b.2) Go to the file location
3.- Execute the file by using the following command
   "java Main.java"

How to run the program:
1.- Select the number if cars to add to a list
2.- Enter the information in the following order
 a) Brand (Ford, Honda, BMW, etc...)
 b) ID (a number for the car)
 c) Model (Civic, ATV, Ryker, Pick up)
 d) Year of manufacture
 e) Color
 f) Price
 g) Registration number
 h) Repeat until the amount of cars has been completed.
3.- Select on how do you want the list to be created according to the information provided.
 a) List of cars given by a Brand (Ford, Honda, BMW, etc...)
 b) List of cars given by a model that has been in use for 'n' years
 c) List of cars given by year of manufacturer
 d) List of cars given by price, highest to lowest.
 
Develop a java program to insert a list of Cars where the fields are Brank, ID, Moel, Year Of Manufacture, Color, Price, Registratiion Number.

This implementation was done through 3 total classes.
* Main
* Cars
* StateMachine

*Main* class, file where the implementation is run. Here the definition of the participants information was set and the objects of the other classes (Participants.java & StateMachine.java) where created.

*Cars* class has the layout to fill the information needed, for example the setters are used to fill the information requested by the user; and the getters this to obtain the information of the array class 'Cars' so this can be printed in the terminal.

*StateMachine* class is a simple file to make use of a Moore State Machine to make this program more automated. This while using a switch case to make the state machine go through, in this example the only use of the state machine class is to limit the possible jumps that can be done in the switch case (most simple state machine)


The desition to use a state machin was primarly to continue learning java, as the implementation of a state machine can be re-used for other coding exercises for a more clean and controlled system.

## Authors

- [@LF-RoGu](https://github.com/LF-RoGu)
- Name: Luis Fernando Rodriguez Gutierrez.
- Matriculation Number: 7219085.
- FHKennung: lurod001.

## Documentation

![FlowChart](Java/Java_PreCheck/Java_PreCheck/png/PreCheck-Java.jpg)


