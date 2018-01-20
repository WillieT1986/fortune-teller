import java.util.Scanner;

//Develop a console application that will tell the user’s fortune based on data received from the user.
public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Recommend to Memorize

		System.out.println("Enter First Name: ");
		String firstName = input.nextLine();
		System.out.println("Enter Last Name: ");
		String lastName = input.nextLine();

		System.out.println("Enter your age: "); // retirement age is 67
		int age = input.nextInt();

		if (age % 2 != 0) { // age is odd
		} else if (age % 2 == 0) { // age is even
		}

		System.out.println("What is your Birth Month in mm status?");
		System.out.println("Example: January would be 1");
		int birthMonth = input.nextInt();
		String bankBalance = "";

		if ((birthMonth == 1) || (birthMonth == 2) || (birthMonth == 3)) {
			bankBalance = "$500,000.01";
		} else if ((birthMonth == 4) || (birthMonth == 5) || (birthMonth == 6)) {
			bankBalance = "$750,000/02";
		} else if ((birthMonth == 7) || (birthMonth == 8) || (birthMonth == 9)) {
			bankBalance = "$1,000,000.03";
		} else if ((birthMonth == 10) || (birthMonth == 11) || (birthMonth == 12)) {
			bankBalance = "$1,250,000.04";
		} else if ((birthMonth > 12) || (birthMonth < 1)) {
			bankBalance = "$0.00";
		}

		System.out.println("What is your favorite ROYGBIV color? ");
		System.out.println("If unsure please type in Help.");
		String roygbiv = input.next();
		String vic = "";

		switch (roygbiv.toLowerCase()) {
		case "red":
			vic = "2017 Dodge Challenger R/T";
			break;
		case "orange":
			vic = "1980 Pontiac Trans Am";
			break;
		case "yellow":
			vic = "2018 Volkswagon Beetle";
			break;
		case "green":
			vic = "1993 AM General M998 Humvee HMMWV";
			break;
		case "blue":
			vic = "2018 Chevy Volt";
			break;
		case "indigo":
			vic = "Tesla Model S";
			break;
		case "violet":
			vic = "Hot Air Baloon";
			break;
		case "help":
			System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo & Violet.");
		}

		System.out.println("How many Siblings?");
		int sibling = input.nextInt();
		String location = "";

		if (sibling >= 0) {
			location = "coordinates: 32.349522, -64.713362"; //Seychelles (Islands located East of Kenya)
		} else if (sibling == 1) {
			location = "Da Nang, Vietnam";
		} else if (sibling == 2) {
			location = "Ho Chi Minh City, Vietnam";
		} else if (sibling == 3) {
			location = "coordinates: 32.292554, -64.763035"; //Bermuda
		} else if (sibling > 3) {
			location = "The Bahamas";
		}

		// Display the user’s fortune in this format:
		System.out.print(firstName + " " + lastName + " will retire in " + (67 - age));
		System.out.print(" years with " + bankBalance + " in the bank, a vacation home in ");
		System.out.println(location + ", and travel in a " + vic);

		input.close();
	}

}
