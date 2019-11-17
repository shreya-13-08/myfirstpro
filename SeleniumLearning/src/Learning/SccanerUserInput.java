package Learning;

import java.util.Scanner;

public class SccanerUserInput {

	public static void main(String[] args) {
		String user;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter user name:");
		user = in.nextLine();
		System.out.println("Welcome " +user);
		

	}

}
