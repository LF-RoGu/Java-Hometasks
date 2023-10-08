
# Java Home Task #2

IDE -> IntelliJ

## Authors

- [@LF-RoGu](https://github.com/LF-RoGu)
- Name: Luis Fernando Rodriguez Gutierrez.
- Matriculation Number: 7219085.
- FHKennung: lurod001.

  
> [!IMPORTANT]
> Run Intructions
> 1. Open the file location where it is stored.
> 2. Open a terminal in this folder, this can be done by pressing *right click* and *open terminal here*.
>
> Or
>
> 2. Open a terminal
>    
>   Ctrl + T (most common one)
>   Go to the file location
> 
> 3. Execute the file by using the following command
>
>    **javac Main.java**
>    
>    **java Main.java**

> [!Note]
> Javac is used to compile the .java file and any other files in the folder (this can be other existing classes that are necessary for the program to run)
> 
> Java is used execute *run* the actual program.


> [!Note]
> This programs where run in a linux enviroment, so the main instructions will be on how to run in a linux enviroment.
> Another section will be added to run this on Windows.



How to run the program:
1. Select the number if cars to add to a list
2. Enter the information in the following order
   
   a) Brand (Ford, Honda, BMW, etc...)
 
   b) ID (Numbers Only)
 
   c) Model (Civic, ATV, Ryker, Pick up)
 
   d) Year of manufacture (YYYY)
 
   e) Color (RED, BLUE, etc)
 
   f) Price (Insert the number directly, without comas)
 
   g) Registration number (Numbers Only)
 
   h) Repeat until the amount of cars has been completed.
 
4. Select on how do you want the list to be created according to the information provided.
   
   a) List of cars given by a Brand (Ford, Honda, BMW, etc...)

   b) List of cars given by a model that has been in use for 'n' years
 
   c) List of cars given by year of manufacturer
 
   d) List of cars given by price, highest to lowest.


 
 
> Develop a java program to insert a list of Cars where the fields are Brank, ID, Moel, Year Of Manufacture, Color, Price, Registratiion Number.
> 
> This implementation was done through 3 total classes.
> * Main
> * Cars
> * StateMachine
> 
> ***Main*** class.
> > File where the implementation is run. Here the definition of the participants information was set and the objects of the other classes (Participants.java & StateMachine.java) where created.
> > Here the *moore state machine* is implemented, where the user starts introducing the data to interact with the program.
> > At the start it creates an Object array (class array) depending on how many different Vehicle the user wants to add.
> > Here after the users inject the information the system moves to the next state of the StMchn, since the condition to move to the next step is a correct information to be added.
> >
> > After all the information is added (Of all the Vehicles) it checkes if all the requiered vehicles have been added. If this is the case then we move to the next StMchn.
> > The system asks the user how it wants the information to be stored. (This is according to the HomeTask2 req)
> > After the files are created successfully then the program comes to an end.
> 
> ***Cars*** class.
> > Public class has the layout to fill the information needed, all variables are set as private to avoid the user to directly access to them. Part of the implementation is to implement some getters & setters to access the information.
> 
> ***StateMachine*** class.
> > File to make use of a Moore State Machine to make this program more automated. This while using a switch case to make the state machine go through, in this example the only use of the state machine class is to limit the possible jumps that can be done in the switch case (most simple state machine)
> 
> 
> The usage of a state machin was primarly to continue learning java, as the implementation of a state machine can be re-used for other coding exercises for a more clean and controlled system.
