import java.util.Scanner;

public class LabThree {

	public static void main(String[] args) {
		// asking user to enter number
		Scanner scan = new Scanner(System.in);
		int userIn;
		System.out.println("Enter your name");
		String name;
		name = scan.next();
		String con;
		boolean cont = true;
		while (cont == true) {
			System.out.println(name + " enter a number between 1 and 100: ");
			userIn = scan.nextInt();
			if (userIn >= 1 & userIn <= 100) {
				if (userIn % 2 != 0 & userIn > 60) {
					System.out.println(userIn + " odd and over 60");
				} else if (userIn % 2 != 0) {
					System.out.println(userIn + " odd");
				} else if (userIn % 2 == 0 & userIn > 60) {
					System.out.println(userIn + " even");
				} else if (userIn % 2 == 0 & userIn < 25) {
					System.out.println("even and less than 25");
				} else if (userIn % 2 == 0 & userIn > 25 & userIn < 61) {
					System.out.println("even");
				} else {
					System.out.println(userIn + " odd");

				}
				System.out.println(name+" would you like to continue? Type either yes or no.");
				con = scan.next();
				if (con.equalsIgnoreCase("yes")) {
					cont = true;
				}
				if (con.equalsIgnoreCase("no")) {
					cont = false;
				}
			}

			else {
				System.out.println(name+ "that number entered not valid");
			}
		}

		scan.close();
	}

}
