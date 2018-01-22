			Week 1 Weekend Project - Fortune Teller

Overview
For my first weekend project,
The User will enter there First & Last name along with their Age, 
Birth Month, Favorite ROYGBIV color and Number of Siblings. 
Once the data is collected the program will greet the User and tell 
them how many years they have left to retire, how much money they 
have in their bank account, the location that he or she will live and 
their mode of transportation. 

Skills Required
For this project, I will be utilizing the skills learned from the 
first week of class which consisted of:
1. Variables and Basic Types
2. Operators and Expressions
3. Conditionals
4. Strings

Skills (Optional)
Stretch goals to utilizing:
1. To do this with the prompts that expect an integer, you will need 
to read in a String, check for “Quit”, then use 
Integer.parseInt(value) to convert the user input to an int.
2. System.exit(0); to terminate your program immediately.
3. Do/While Loops.

Part 1
The information needed from the User:

[X] Ask the user for the user’s First Name. 																	
[X] Ask the user for the user’s Last Name.  																	
[X] Ask the user for the user’s Age.																			
[X] Ask the user for the user’s Birth Month (as an ‘int’). 														
[X] Ask the user for the user’s Favorite ROYGBIV color. 														
[X] If the user does not know what ROYGBIV is, ask the user to enter 
    “Help” to get a list of the ROYGBIV colors.
[X] Ask the user for the user’s Number of Siblings. 	

Part 2
Once the Age, Birth Month, Favorite ROYGBIV & Siblings information is
entered they will trigger certain conditions. For Example:

[X] Age will trigger how many years till he or she retires at 67.
[X] Birth Month entered as a number between 1 through 12 will trigger
how much money they will have.
[X] Favorite ROYGBIV will trigger his or her mode of transportation.
[X] Sibling amount will trigger where they live. 
    (Will you trigger the location listed as coordinates?) 

Part 3
The end result will look similar to this example:

"Tara Cat will retire in 14 years with $1,000,000.03 in the bank, a 
vacation home at The Bahamas and travels in a Hot Air Baloon."

Part 4
Example Coding

First Name:
	System.out.println("Enter First Name: ");
	String firstName = input.nextLine();

Last Name:
	System.out.println("Enter Last Name: ");
	String lastName = input.nextLine();

Age:
	System.out.println("Enter your age: "); // retirement age is 67
	int age = input.nextInt();

		if (age % 2 != 0) { // age is odd
		} else if (age % 2 == 0) { // age is even
		}

Birth Month:
	System.out.println("What is your Birth Month in mm status?");
	System.out.println("Example: January would be 1");
	int birthMonth = input.nextInt();
	String bankBalance = "";

		} else if ((birthMonth == 7) || (birthMonth == 8) || (birthMonth == 9)) {
		bankBalance = "$1,000,000.03";

Favorite ROYGBIV:
	System.out.println("What is your favorite ROYGBIV color? ");
	System.out.println("If unsure please type in Help.");
	String roygbiv = input.next();
	String vic = "";

		case "violet":
		vic = "Hot Air Baloon";
		break;

Number of Siblings:
	System.out.println("How many Siblings?");
	int sibling = input.nextInt();
	
	String location = "";

		} else if (sibling > 3) {
		location = "The Bahamas";
		}




Software Used
1. Eclipse IDE
2. Sublime (for readme.txt)