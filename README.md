
# SIMULINK VIEWER Project
## Description: 
The aim of this project is to develop a software tool that can read Simulink MDL files 
and display their contents in a user-friendly way using a Java-based graphical user 
interface (GUI)

##Features:
- Load and parse Simulink MDL files
- Display the Simulink model in a hierarchical structure

## Tools and Technologist we used :
- Java JDK 19
- Apache NetBeans 15 IDE 15

## Classes Discription:
- readMDLfile 
 Read the needed data from MDL file

- Block:
Creat array of Objects from this class and save the data which we got from Class "readMDLfile" in the appropriate block

- Point:
Creat array of Object from this class to save the coordienates of the branching lines
which we get from "readMDLfile"

- SimulinkViewer:
Display the Simulink model depend on the  data we get in "Block" and "Point" classes

- FirstPane:
Make a user-friendly interface (GUI) which allow the user to select the MDL file 

- Simuklink_App:
Contain the Primary Stage which contain the "FirstPane" object


## The Primary Stage Photo
![](https://github.com/Anas2108/SIMULINK_VIEWER_Project/blob/main/Snapshots%20of%20project/first%20pane.png)

## The Second Stage Photo
![SIMULINK View](https://github.com/Anas2108/SIMULINK_VIEWER_Project/blob/main/Snapshots%20of%20project/simulink.png)

## Important Note 
 to use this project 
- Download the "Project.zip" file then extract it and run the Batch (Compiled using JDK 1.8)
in "jar" file 
