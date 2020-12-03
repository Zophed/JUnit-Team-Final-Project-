Team 10:
Anthony Onstott
Nathan Nelson
Carl Painter
Zachary Riggle

Potential short comings of Fraction program:

- As this program was written in order to solve the issues that are outlined in the 
	provided "FractionTestJupiter.java" and "IllegalArgumentJupiter.java" 
	programs, there are all but guaranteed situations that the program could
	be broken by certain commands being issued to it. For example, it is not
	designed to take doubles as arguments in certain methods (the constructor of
	the fraction class being one that comes directly to mind).
- The JUnit testing environments do not necessarily test all aspects of the code 
	as rigorously as it could be. It doesn't attempt a memory overflow error (not
	that this is entirely plausible for this program) nor does it attempt to enter
	different data types into the programs. These could cause unforseen issues to
	arise that could break this program (as much as it could be; the most likely
	scenario is that the program just exits with an error code, although it has the
	potential for a memory leak to occur and crash the end system it is running on).
- The solutions that solve the errors presented by the testing environment are done
	exclusively for the problem solving nature of the assignment. They are not
	performed to extend the usability of the program, simply to fix the broken
	aspects that do not have the functionality necessary to run the tests. It is a
	barebones approach, with little to no regard for the actual functionality or 
	usability of such a fractions program.
	
