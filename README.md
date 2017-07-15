# Detecting-Cycle-in-Undirected-Graph #

## Introduction ##
In the given problem, we detect if a given graph has a cycle of a given length. 


## Algorithmic Overview ##
As always, DFS is used to detect cycles in a graph. On top of DFS, a condition is added to check if the length of the cycle is equal to the required cycle length
Note that in an undirected graph, there can be no cycles of length less than 3 


## Implementation Details ##
Java Swing is used to build the application. Java Forms are used to generate the UI. Text Validation is done for all the fields. 

## Code Overview ##


## How to Execute ? ##
Your computer must have Java installed. Just open the jar file, and play with it as mentioned above 

## Working of the UI ##
There are three buttons: Create New Graph, Add Edge and Find Cycle. The Panel to the right gives the log for the current graph. The Panel down gives general messages 

![image](https://user-images.githubusercontent.com/21295042/28241475-3f9a0192-6963-11e7-8105-5ddbee61d3cb.png)


STEP 1: CREATE A GRAPH


Mention the number of vertices (𝑛) in the graph in the Text Box in-front it. On Clicking the button, A graph with vertices numbered from 0 to 𝑛 − 1 is created
A text validation is performed on the text field to make sure that the input is always a non-negative integer

STEP 2: ADD EDGE

Add the start and end vertices in the Text Field. Input validation takes care that the number entered is a valid vertex number 


STEP 3: ENTER THE CYCLE LENGTH

