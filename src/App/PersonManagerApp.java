package App;

import java.io.Console;
import java.util.Scanner;

public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager");
		Console c = new Console();
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Create customer or employee  (c/e): ");
			String player = sc.next();

			
			
			
			
			
			choice = c.getString("Continue? (y/n)", "y", "n");
		}
System.out.println("Goodbye");

	}
}
