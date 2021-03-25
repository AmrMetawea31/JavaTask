Employee class:
Initialize the attributes with their setters and getters
Attributes are {Name,
sapID,
ProjectName by default "onBench",
Status by default "Active",
Flag by default "True"}

ExpleoEmployee class:
define arraylist as constructor called "employeeList" then start to build the required functions as the following
hire function: Take String name and arraylist as input and then we get the sapID of the last employee in the list and increment it with 1 to set the sapID for the new hired employee then add him to the list
resignOrFire function: Take String name and arraylist as input and start to loop in the arraylist comparing the name once it find the employee it switch the flag to false and set the status to "Not Active"
toString function: take the arraylist of the employees and start to print the name and sapID of each one


EngineeringExpleoEmployee class:
used inheritance from ExpleoEmployee class and build the below function
assign function: Take String employee's name and arraylist of employees as input and start to loop in the arraylist comparing the name once find the employee , set the project name with the given name


ExpleoTest class:
Before each test case arraylist of employees is initialized as already existing list then start the following test cases 
1-add the new hired employee to check that sapID set correctly 
2-change the status for the resigned employee
3-displaying the employee's ID
4-change the project name from "onBench" to the assigned project name.
