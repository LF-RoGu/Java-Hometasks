
# Home Task #1

Home Task was done to put to test learned skills, this can go from a input, 

IDE -> IntelliJ

## Authors

- [@LF-RoGu](https://github.com/LF-RoGu)
- Name: Luis Fernando Rodriguez Gutierrez.
- Matriculation Number: 7219085.
- FHKennung: lurod001.

> [!Note]
> This programs where run in a linux enviroment, so the main instructions will be on how to run in a linux enviroment.
> Another section will be added to run this on Windows.



> [!Note]
> To run each of the problems one must access to each of the folders and run the sequence mention for each problem.
> 
> **JAVAC** is used to compile the .java file and any other files in the folder (this can be other existing classes that are necessary for the program to run)
> 
> **JAVA** is used execute *run* the actual program.



## Problem 1
### Variables, Operators, Expressions, Statements, and Blocks 
Implement a method or methods to calculate the volume of a sphere given the information in this problem.

> ### Solution Implementation
> A Class called *Volume.java* was created to store the implemented methods.
> This methods are called:
> * get_varVolumeEarth()
> * get_varVolumeSun()
>
> For this problem there are 2 volumes to calculate, in which the radius of the spheres are provided:
> * Sun -> 865,000 miles
> * Earth -> 7,600 miles
> This methods return a double value. The units that was done for this where mts. Intead of miles, this to make easier to corroborate with external calculators and make sure that the return value was the correct one.
>
> The output value of the Volume is in miles as requested in **Problem 1**; However this is printed in another statement, as it could be valuable to have both values, converted to mts and another that it is in miles.
> 
> Another thing to calculate is the ratio of the **Volume** between this 2 spheres.
> For this implementation a relation (division) bewteen the 2 values was made, and then substract one from the other. This comparison is done between the Sun volume ratio and the Earth volume ratio. This considering that the Sun ratio will always be bigger that the earth.


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

## Problem 2
### Control Flow Statements
Control statement using labels, this are used specific to break the current statement, but not break the cycle. Refering as, to exit the current cycle and continue in the next step of the cycle. 

The logic behind this control flow statements work as the following:
> If a cycle of the flow of the code is cyclical and a certain condition is met that this *flow* needs to stop, but only for this specific cycle.
> #### Explication
> You are driving your car (driving is your *for/while cycle*), the you need to stop at a **red light**, but after this you don't stop driving you continue, you just need to make a stop of the current cycle.
> Then this label's are put into work, you set your continion to activate this vale *(continue **label**)* then all future logic will not be run, but you will remain drivin (in your cycle)


> ### Solution Implementation
> If the operation module between the 2 values is equal to ZERO. Meaning the value is not a prime number.
> Then the current cycle should break, meaning we just abroutly stop current cycle to continue in the next one.
> An equivalent explination logic is:

While (flag)
{
    for(parameters)
    {
        if(blah blah equals true)
        {
            /* Only exits for, but saving current value of parameters */
            break;
        }
    }
}

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


## Problem 3
### Object Basics and Simple Data Objects, The Life Cycle of an Object,Characters and Strings 
Count the amount of vocals, spaces and consonants are in the stored string.

> ### Solution Implementation
> For this logic a simple for cycle was suficient, where each character was checked. If it is a space, a counter is increase and another counter for the vowels.
> Counters implemented:
> * spaces
> Check if the character is equal to ' '.
> * vowels
> Check if the character is between *a* & *z*
>     *If the character is equal to a vowel then increase vocal counter
> * letters
> Check if the character is between *a* & *z*
>     *If the character is not equal to a vowel then increase letter counter

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


## Problem 4
### Object Basics and Simple Data Objects
Order the text in alphabetical order.

> ### Solution Implementation
> A bubble sort method was implemened to arrange this words.
> This implementation was done in 2 stages:
> 1. Separate the text in an array, so every word is in a position so it can be compared to the next word and so on.
> 2. Implement the bubble sort method, there are 2 *for* cycles. One inside the other, in the first *for cycle* is for the selection of the word to compare. The second *for cycle* is to compare in the whole string and make the necessary swaps according to the logic.
> In the bubble sort method a temporal string was made to store the current word being checked.

> This kinda works this way:
> 
> a = str[i];
> 
> b[j] = str[j+1];
> 
> c[j+1] = a;


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
