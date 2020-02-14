//Lawrence Luong
//4th period
//10/22/19
//A method that prints an hourglass

import java.util.*;

public class Hourglass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continuing = true;
		while(continuing) {
			System.out.print("How big is your hourglass?");
			int size = input.nextInt();
			String hourglasses = "";
			hourglasses += ("|");
			for(int i = 0; i < size; i++) {
				hourglasses += ("\"");
			}
			hourglasses +=("| \n");
			for(int i = 1; i <= (size/2) - 1; i++) {
				for(int j = 0; j < i; j++) {
					hourglasses += " ";
				}
				hourglasses += "\\";
				for(int k = 0; k < -2 * i + size; k++) {
					hourglasses += ":";
				}
				hourglasses += ("/ \n");
			}
			for (int i = 0; i < size/2; i++) {
				hourglasses += (" ");
			}
			if(size % 2 == 0) {
				hourglasses += ("|| \n");
			}else {
				hourglasses += "||| \n";
			}
			for (int i = size/2 -1; i > 0; i--) {
				for(int j = 0; j < i; j++) {
					hourglasses += (" ");
				}
				hourglasses += ("/");
				for(int k = 0; k < -2 * i + size; k++) {
					hourglasses += (":");
				}
				hourglasses += ("\\ \n");
			}
			hourglasses += ("|");
			for(int i = 0; i < size; i++) {
				hourglasses += ("\"");
			}
			hourglasses +=("| \n");
			System.out.println(hourglasses);
			System.out.println("Type \"quit\" to stop: ");
			String reply = input.next();
			if(reply.equalsIgnoreCase("quit")) {
				continuing = false;
			}else {
				continuing = true;
			}
		}
		input.close();
	}
}

