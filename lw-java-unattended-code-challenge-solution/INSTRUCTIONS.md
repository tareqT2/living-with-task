# Unattended Programming Challenge

## Parts List

Thank you for taking the time to complete our programming exercise.
This is a maven project with three Java classes containing the production code and unit tests for a small command line application.
Good luck!

## Scenario

The application emulates a parts list system the accepts a list of parts as arguments and prints the list of parts and the total weight to the standard out.
An inexperienced software developer has written the application.
Please refactor it into more maintainable, testable and object-oriented code.

The parts list currently prints an individual line for every part.
There is a requirement that it should be modified to print only a single line for each type of part.
Each part line should display how many of that part are needed, the name of the part, the weight of the part, and total weight of the number of parts.

The parts list currently outputs the following for the input `RED_BLOCK_SMALL RED_BLOCK_SMALL RED_BLOCK_MEDIUM`:

1 RED_BLOCK_SMALL : 10.00g
1 RED_BLOCK_SMALL : 10.00g
1 RED_BLOCK_MEDIUM : 20.00g
TOTAL WEIGHT : 40.00g

The application should be modified to output this:

2 RED_BLOCK_SMALL (10g each) : 20g
1 RED_BLOCK_MEDIUM (20g each) : 20g
TOTAL WEIGHT : 40g

Please think about and apply all the best practices you would normally use, such as:

* Object oriented domain model
* Testing
* Refactoring
* Clean code

This code challenge is an opportunity for you to demonstrate what your capabilities.
Try to show us what you can do in all areas described above to produce high quality result.

Spend between 1 and 2 hours on the challenge.
Please do not spend more time than this.
