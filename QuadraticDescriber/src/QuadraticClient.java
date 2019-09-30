//Lawrence Luong
//September 25, 2019
//Period 4
//A method that handles interactions with the user

import java.util.*;
public class QuadraticClient {
	public static void main(String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		boolean continuing = true;
		Scanner console = new Scanner(System.in);
		while(continuing) {
			System.out.print("a : ");
			double a = console.nextDouble();
			System.out.print("b : ");
			double b = console.nextDouble();
			System.out.print("c : ");
			double c = console.nextDouble();
			System.out.println(Quadratic.quadDescriber(a,b,c));
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String response = console.next();
			if(response.equalsIgnoreCase("quit")) {
				continuing = false;
			}else {
				continuing = true;
			}
		}
		console.close();
	}
}
