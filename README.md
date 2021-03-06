# Detecting-Cycle-in-Undirected-Graph #

## Introduction ##
In the given problem, we detect if a given graph has a cycle of a given length. 


## Algorithmic Overview ##
As always, DFS is used to detect cycles in a graph. On top of DFS, a condition is added to check if the length of the cycle is equal to the required cycle length
Note that in an undirected graph, there can be no cycles of length less than 3 


## Implementation Details ##
Java Swing is used to build the application. Java Forms are used to generate the UI. Text Validation is done for all the fields. 

## Code Overview ##

The code is saved in the src folder

Graph : Consists of the algorithm to detect a cycle 
NewJFrame.FORM : Consists of the input form in the UI 
NewJFrame.java : Consists of the Swing Application 

## How to Execute ? ##
Your computer must have Java installed. Just open the jar file, and play with it as mentioned above 

## Working of the UI ##
There are three buttons: Create New Graph, Add Edge and Find Cycle. The Panel to the right gives the log for the current graph. The Panel down gives general messages 

![image](https://user-images.githubusercontent.com/21295042/28241982-1befe24c-696e-11e7-84a2-45dc25d44c16.png)


STEP 1: CREATE A GRAPH

![image](https://user-images.githubusercontent.com/21295042/28241977-fb3c646c-696d-11e7-9333-ec02af669870.png)

Mention the number of vertices (𝑛) in the graph in the Text Box in-front it. On Clicking the button, A graph with vertices numbered from 0 to 𝑛 − 1 is created
A text validation is performed on the text field to make sure that the input is always a non-negative integer

STEP 2: ADD EDGE

![image](https://user-images.githubusercontent.com/21295042/28241970-e1ac576e-696d-11e7-8830-b80ef7950292.png)

Add the start and end vertices in the Text Field. Input validation takes care that the number entered is a valid vertex number 


STEP 3: ENTER THE CYCLE LENGTH

![image](https://user-images.githubusercontent.com/21295042/28241960-c0c05d70-696d-11e7-8ff5-d4d7be3f20bd.png)

