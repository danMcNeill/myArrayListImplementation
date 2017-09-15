-----Daniel McNeill README for assign 1 -----


MUST BE IN daniel_mcneill_assign_1/myArrayList directory for these commands:



## to clean:
	ant -buildfile src/build.xml clean
## to compile:
	ant -buildfile src/build.xml all
## to run:
	ant -buildfile src/build.xml run -Darg0=(input file) -Darg1=(output file)



"I have done this assignment completely on my own. I have not copied it, nor have I given my solution to anyone else. I understand that if I am involved in plagiarism or cheating I will have to sign an official form that I have cheated and that this form will be stored in my official university record. I also understand that I will recieve a grade of 0 for the involved assignment for my first offense and that I will receive a grade of F for the course for any additional offense.
Date: 09/15/17 "



DATA STRUCTURES:
	MyArrayList int array:
		I chose an int array as the data structure because that was what was specified in the assignment. We used this int array as a basis for our implementation of our array list.

	Results list of strings:
		I chose to store the Results' strings in a list that is instantiated as an ArrayList of strings when the Results object is created. I chose this because there is no way to know how many strings will be stored in the results object, so I wanted the list to be able to expand with ease. 
