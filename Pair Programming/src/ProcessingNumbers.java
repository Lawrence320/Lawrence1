//Lawrence Luong
//October 2, 2019
//4th period

import java.util.*;
public class ProcessingNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to input: ");
		int totalNum = input.nextInt();
		while(totalNum <= 0) {
			System.out.println("Please enter a number more than 0");
		}
		System.out.println("Please input a number: ");
		int num = input.nextInt();
		int max = num;
		int min = num;
		int maxEven = num;
		int sum = 0;
		for(int i = 1; i < totalNum; i++) {
			System.out.println("Enter next number: ");
			num = input.nextInt();
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
			if(num % 2 == 0) {
				sum += num;
			}
			if((num % 2 == 0) && num > maxEven) {
				maxEven = num;
			}
		}
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		if(sum == 0) {
			System.out.println("There are no even numbers.");
		}else {
			System.out.println("Sum of even numbers: " + sum);
			System.out.println("Max even number: " + maxEven);
		}
		input.close();
	}
}