package assignment;
import java.util.Scanner;
public class FirstClassInGit {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//add a statement to display your name in the console
		System.out.println("My name is Charles.");
		//Then commit your changes
		Scanner input = new Scanner(System.in);
		System.out.println("What is your last name?");
		String name = input.nextLine();
		input.close();
		System.out.print("Your last name is " + name + ".");
		

	}

}
