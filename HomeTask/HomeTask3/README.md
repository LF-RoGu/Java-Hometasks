
# Java Home Task #3

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




> How to run the program:
> 
> To add information to the program there are 2 ways on how it was implemented, through **constructors** or **setters**.
> 1. Select how many vehicle do you want to add in one go. This through the enum **l_enumVehiclesAdded**, just add how many vehicles are to be added in the data type.
> 2. Create one class **Manufactured** for each of the vehicles to be added, via the constructor or setters and getters
> > [!Note]
> > Current name of variable to add information **l_subClassVehicle**.
> 
> 3. Add another subclass for **Engine**. This should have as an input for the constructor the class **Manufactured**
> 4. Add the information in the subclass corresponding to **Vehicle** (an array has already been created and automated to however many vehicles are to be added).
> > [!Note]
> > In ***Main.java*** there is already an example using both methods.
> > > How to use:
> > > l_subClassVehicle[**Vehicle Variant**] [**Number of vehicle**] = new Vehicle.**Vehicle Variant**(Constructor information)
> > > Vehicle Variant -> This is from the enum **l_enumVehicles**, add vehicle type, as there is a row for each vehicle type.
> > > Number of vehicle -> This is from the enum **l_enumVehiclesAdded**, add corresponding number of vehicle for each vehicle type.
> > > Constructor information -> This is to add the subclasses/classes already created in the following order (**Manufactured**, **Engine**)
> > >
> 5. To show all the vehicle information, just call the method **showCharacteristics**. For each of the vehicle variants, it will display different information.
> 6. At the end of the program, a file ***.txt*** will be stored in a folder named **GenTxt**. This will be in the same path where the program wil be executed.

 
 
> Develop a java program to insert a list of Cars where the fields are Brank, ID, Moel, Year Of Manufacture, Color, Price, Registratiion Number.
> 
> This implementation was done through 3 total classes.
> * Main
> * Manufacture
> * Engine
> * Vehicles
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
> 
> ***Manufacture*** class.
> > Public class has the layout to fill the information needed, all variables are set as private to avoid the user to directly access to them. Part of the implementation is to implement some getters & setters to access the information.
>
> ***Engine*** class.
> > Public class to set the information about the engine. In this class, 3 subclasses where created as per requirement. Each of this subclasses receives the information they need from the class *Manufactured*, since this should have all the setters and getters in this program.
> > *CombustionEngine*
> > *ElectricEngine*
> > *HybridEngine*
>
> ***Vehicles*** class.
> > Public class that will receive the information both from *engine* and *manufactured* as a parameter. In this class, 3 subclasses where created as per requirement. Each of this subclasses receives the information they need from the class *Manufactured* & *Engine*, since this should have all the setters and getters in this program.
> > *ICEV*
> > *BEV*
> > *HybridV*
> >
> > Each of this subclasses receives a different subclass for engine, as there are personalized options for each vehicle type.
> > Each of this subclasses has an @override method named *showCharacteristics*. This method is used to show through the terminal all the information about each vehicle. This once again, through the *Manufactured* class, as all setters and **getters* are to be in that class.
