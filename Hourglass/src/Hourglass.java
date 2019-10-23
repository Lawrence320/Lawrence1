//Lawrence Luong
//4th period
//October 9th, 2019

import java.util.*;
public class Hourglass {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many lines does your hourglass have?");
		int size = scanner.nextInt();
		System.out.print("|");
		for(int quote = 1; quote <= size; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
		for(int line = 1; line <= size; line++) {
			for(int space = 0; space < line; space++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for(int colon = 1; colon <= -2 * line + size; colon++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
		scanner.close();
	}
}