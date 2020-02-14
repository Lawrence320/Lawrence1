//Lawrence Luong
//4th period
//11/20/19

package oldFracCalc;

import java.util.*;

public class OldFracCalc {
	
	//Creates a scanner and asks the user what their equation is
    public static void main(String[] args) {
    	boolean continuing = true;
    	Scanner scanner = new Scanner(System.in);
    	while(continuing) {
    		System.out.println("Please enter your input");
    		String input = scanner.nextLine();
    		String answer = produceAnswer(input);
    		System.out.println(answer);
    		System.out.println("Do you want to keep going?");
    		String response = scanner.nextLine();
    		if(response.equalsIgnoreCase("quit")) {
    			continuing = false;																																																																																																																																																				
    		}else {
    			continuing = true;
    		}
    	}
    	scanner.close();
    }
    //// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
    	if(input.indexOf(' ') == -1){
    		return "invalid input";
    	}
    	String [] splitTheSpaces = input.split(" ");
    	String operand1= splitTheSpaces[0]; 
    	String operator= splitTheSpaces[1];
    	String operand2= splitTheSpaces[2]; 
    	
    	int[] placeholder1= parse(operand1);
    	int[] placeholder2= parse(operand2);
    	
    	String mixednum;
    	int[] answer = new int[2];
    	if(operator.length() != 1){
    		throw new IllegalArgumentException("ERROR: operator required");
    	}
        if(operator.equals("+") == true){  //checks if the equation is adding
        	answer = add((placeholder1),(placeholder2));
        }else if(operator.equals("-") == true){  //checks if the equation is subtracting
        	answer = subtract(placeholder1, placeholder2);
        }else if(operator.equals("*") == true){ //checks if the equation is multiplying
        	answer = multiply(placeholder1, placeholder2);
        }else if(operator.equals("/") == true){ //if the equation doesn't pass the first 3 conditionals, then we assume the equation is dividing  
        	answer= divide(placeholder1, placeholder2);
        }
        int[] reduceImproperFraction = reduce(answer); //reduces the result from the equation
     	if(reduceImproperFraction[0] == 0 && reduceImproperFraction[1] != 0) { 
     		mixednum = reduceImproperFraction[1] + "/" + reduceImproperFraction[2]; 
     	}
     	else if (reduceImproperFraction[1] == 0) {  
     		mixednum = "" + reduceImproperFraction[0];
     	}
     	else if (reduceImproperFraction[0] == 0 && reduceImproperFraction[1] == 0) { 
     		mixednum = "0";
    	}
     	else {
     		mixednum = reduceImproperFraction[0] + "_" + reduceImproperFraction[1] + "/" + reduceImproperFraction[2];
     	}
        return mixednum; //returns the answer
    }
    //this method reduces the fraction
    public static int[] reduce(int[] operand) { 
    	int [] fractionReduced = new int [3]; 
    	int wholeNum = operand[0]/operand[1];
    	operand[0] = (operand[0] % operand[1]);
    	if (wholeNum != 0) {
    	operand[0] = absValue(operand[0]);
    	}
    	int factor = gcf(operand); 
    	int numerator = operand[0]/factor;
    	int denominator = absValue(operand[1]/factor); 
    			fractionReduced[0] = wholeNum; 
    			fractionReduced[1] = numerator; 	
    			fractionReduced[2] = denominator; 
    		return fractionReduced; 
    }
    //this method returns the absolute value of a double
    public static double absValue(double num1) {
		if(num1 < 0) {
			num1 *= -1;
		}else {
			num1 *= 1;
		}
		return num1;
	}
    //this method returns the absolute value of an integer
    public static int absValue(int num1) {
		if(num1 < 0) {
			num1 *= -1;
		}else {
			num1 *= 1;
		}
		return num1;
	}
    //this value takes in 2 doubles and returns the minimum between the 2 doubles
    public static double min(double num1, double num2) {
		if(num1 < num2) {
			return num1;
		}else {
			return num2;
		}
	}
    //this method takes in an array of integers and returns the greatest common factor of a fraction
    public static int gcf(int[] operand) { 
		int number = 1;
		int factor = 1;
		while (number <= min(absValue(operand[0]), operand[1])) { 
			if (absValue(operand[0] % number) == 0 && absValue(operand[1] % number) == 0) {
				factor = number; 
			}
			number++;
		}
		return (factor);
	}

    //changes the fraction from a mixed fraction to an improper fraction
    public static int[] toImproperFrac(int whole, int numerator, int denominator) {
		int[] improperFrac= new int[2]; 
		improperFrac[0] = whole * denominator + numerator;
		improperFrac[1] = denominator;
		return improperFrac;
    }
    
    //splits the operand into 3 parts: whole, numerator, and denominator
    public static int[] parse(String operand) { 
    	String[] checkWhole = operand.split("_"); 
		String[] frac = checkWhole[checkWhole.length - 1].split("/");
		String[] threeOp = new String[3];
		int space = operand.indexOf("_"); 
		int slash = operand.indexOf("/");
		threeOp[2] = "1";
		int[] operandInt = new int[3]; 
		if(space < 0 && slash >= 0){
			threeOp[0]= "0";
		}
		else {
			threeOp[0] = checkWhole[0];
		}
		if(slash < 0){
			threeOp[1] = "0";
			threeOp[2] = "1";
		}
		else {
			threeOp[1] = frac[0];
			threeOp[2] = frac[1];
		}
		for(int i = 0; i < threeOp.length; i++){
			operandInt[i] = Integer.parseInt(threeOp[i]); 
		}
		if(operandInt[0] < 0)
			operandInt[1] = operandInt[1] * -1;
		int[] improper = toImproperFrac(operandInt[0], operandInt[1], operandInt[2]); 
		return improper;
	}
    //This method adds fractions and returns the sum of the fractions
	public static int[] add(int[] firstOperand, int[] secondOperand){ 
		int[] commonDen= new int[1];
    	int[] newNum= new int[1];
    	if(firstOperand[1] == secondOperand[1]){ 
    		commonDen[0]= firstOperand[1];
    		newNum[0]= firstOperand[0] + secondOperand[0];
    	}else{  
    		commonDen[0] = firstOperand[1] * secondOperand[1];
    		newNum[0]= firstOperand[0] * secondOperand[1] + secondOperand[0] * firstOperand[1];
    	}
    	int[] answer = new int[2];
    	answer[0]= newNum[0];
    	answer[1]= commonDen[0];
    	
    	return answer;
	}
	//This method subtracts fractions and returns the difference of the fractions
    public static int[] subtract(int[] firstOperand, int[] secondOperand) { 
    	int[] answer = new int[2]; 
    	int[] array = new int[2]; 
		array[0] = (firstOperand[0]*secondOperand[1]) - (firstOperand[1]*secondOperand[0]);	
		answer[0] = array[0];
		answer[1] = firstOperand[1]*secondOperand[1];
		return answer;
	}
    //This method multiplies fractions and returns the product of the fractions
    public static int[] multiply(int[] firstOperand, int[] secondOperand) {
    	int[] answer = new int[2]; 
    		answer[0] = (firstOperand[0] * secondOperand[0]); 
    		answer[1] = (firstOperand[1] * secondOperand[1]); 
    		return answer;
    	}
    //This method divides fractions and returns the quotient of the fractions
    public static int [] divide(int[] firstOperand, int[] secondOperand) {
    	if (secondOperand[0] <= -1) {
    		secondOperand[1] *= -1;
    	}
    	int denominator = secondOperand[1]; 
    	secondOperand[1] = absValue(secondOperand[0]);
    	secondOperand[0] = denominator;  
    	int[] answer = multiply(firstOperand, secondOperand); 
    	return answer;
    }
} 