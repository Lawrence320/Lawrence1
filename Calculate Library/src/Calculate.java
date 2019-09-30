/*Lawrence Luong
 * August 29, 2019
 * Period 4
 * Group of methods that perform math calculations (a library)
 */
public class Calculate {
	// a call to square return the square of the value passed.
	//It accepts and returns an integer.
	public static int square(int number) {
		int answer = 0;
		answer = number * number;
		return answer;
	}
	// a call to cube return the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number * number * number;
		return answer;
	}
	// a call to average return the average of the value passed.
	//It accepts two doubles and returns a double.
	public static double average(double number1, double number2) {
		double answer = 0;
		answer = (number1 + number2)/2;
		return answer;
	}
	// a call to average return the average of the value passed.
	//It accepts three doubles and returns a double.
	public static double average(double number1, double number2, double number3) {
		double answer = 0;
		answer = (number1 + number2 + number3)/3;
		return answer;
	}
	//a call to convert an angle measure give in radians into degrees
	//It accepts a double and returns a double
	public static double toDegrees(double number) {
		double answer = 0;
		answer = (number * 180)/3.14159;
		return answer;
	}
	//a call to convert an angle measure given in degrees into radians
	//It accepts a double and returns a double
	public static double toRadians(double number) {
		double answer = 0;
		answer = (number * 3.14159)/180;
		return answer;
	}
	/* a call to provide the coefficients of a quadratic equation in standard form 
	 * and returns the value of the discriminant. 
	 */
	//It accepts three doubles and returns a double
	public static double discriminant(double number1, double number2, double number3) {
		double answer = 0; 
		answer = (number2 * number2 - 4 * number1 * number3);
		return answer;
	}
	//A call to convert a mixed number into an improper fraction
	//it accepts three integers and returns a string
	public static String toImproperFrac(int number1, int number2, int number3) {
		if(number3 == 0) {
			throw new IllegalArgumentException("Denominator can not be 0");
		}
		return (number3 * number1 + number2) + "/" + number3;
	}
	//a call to convert an improper fraction to a mixed number
	//it accepts two integers and returns a string
	public static String toMixedNum(int number1, int number2) {
		if(number2 == 0) {
			throw new IllegalArgumentException("Denominator can not be 0");
		}
		int whole = number1 / number2;
		int numerator = number1 % number2;
		return whole + "_" + numerator + "/" + number2;
	}
	//a call to convert a binomial multiplication of the form into a quadratic equation
	//it accepts four integers and a string and then returns a string
	public static String foil(int a, int b, int c, int d, String variable) {
		String polynomial = "";
		polynomial += (a * c) + variable + "^2 + " + ((b * c) + (d * a)) + variable + " " + (b * d);
		return polynomial;
	}
	//a call to determine whether or not one integer is evenly divisible by another
	//it accepts two integers and returns a boolean
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException("Can not be divided by 0");
		}
		if(num1 % num2 != 0) {
			return false;
		}else {
			return true;
		}
	}
	//a call to return the absolute value of the number passed
	//it accepts a double and returns a double
	public static double absValue(double num1) {
		if(num1 < 0) {
			num1 *= -1;
		}else {
			num1 *= 1;
		}
		return num1;
	}
	//a call to return the larger of the values passed
	//it accepts two doubles and returns a double
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	//a call to return the larger of the values passed
	//it accepts three doubles and returns a double
	public static double max(double num1, double num2, double num3) {
		double maximum = max(num1 , max(num2, num3));
		return maximum;
	}
	//a call to return the smaller of the values passed
	//it accepts two integers and returns an integer
	public static int min(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static double min(double num1, double num2) {
		if(num1 < num2) {
			return num1;
		}else {
			return num2;
		}
	}
	//a call to round a double correctly to 2 decimal places
	//it accepts a double and returns a double
	public static double roundTo2DecimalPlaces(double num1) {
		int rounded = (int) (num1 / absValue(num1));
		int result = (int) absValue((int)(num1*1000));
		if(result % 10 >= 5) {
			return rounded * ((int) ((result + 10)/10))/100.0;
		}else {
			return rounded * (result/10)/100.0;
		}
	}
	//a call to raise a value to a positive integer power
	//it accepts a double and an integer and returns a double
	public static double exponent(double num1, int num2) {
		double result = 1;
		if(num2 < 0) {
			throw new IllegalArgumentException("Invalid Arugment");
		}
		for(int i = 0; i < num2; i++) {
				result *= num1;
		}
		return result;
	}
	//a call to return the factorial of the value passed
	//it accepts an integer and returns an integer
	public static int factorial(int num) {
		if(num == 1) {
			return 1;
		}else if(num < 0){
			throw new IllegalArgumentException("Input can not be a negative value");
		}
		int result = num * factorial(num - 1);
		return result;
	}
	//a call to determine whether or not an integer is prime
	//it accepts an integer and returns a boolean
	public static boolean isItAPrimeNumber(int num) {
		for(int i = 2; i < num; i++) {
			if(isDivisibleBy(num, i)) {
				return false;
			}
		}
		return true;
	}
	//a call to find the greatest common factor of two integers
	//it accepts two positive integers and returns an integer
	public static int greatestCommonFactor(int num1, int num2) {
		int output = 1;
		for(int i = 1; i <= num1; i+=1) {
			if(isDivisibleBy(num1, i) && isDivisibleBy(num2, i)) {
				output = i;
			}
		}
		return output;
	}
	/*a call to return an approximation of the square root of the value passed
	 * rounded to two decimals
	 */
	//it accepts a double and returns a double
	public static double squareRoot(double num) {
		if(num < 0) {
			throw new IllegalArgumentException("Can't square root a negative number");
		}
		double result = 1;
		while(!(absValue(num - result * result) < 0.005)) {
			result = 0.5 * (num / result + result);
		}
		return roundTo2DecimalPlaces(result);
	}
	/*a call to use the coefficients of a quadratic equation in standard form and uses
	 * the quadratic formula to approximate the real roots, if any.
	 */
	//it accepts three integers and returns a string
	public static String theQuadraticFormula(int a, int b, int c) {
		double discriminant = discriminant(a, b, c);
		if(discriminant < 0) {
			return "no real roots";
		}else if(discriminant == 0) {
			return roundTo2DecimalPlaces(-b/2*a) + "";
		}else {
			double root1 = roundTo2DecimalPlaces((-b + squareRoot(discriminant)) / (2.0 * a));
			double root2 = roundTo2DecimalPlaces((-b - squareRoot(discriminant)) / (2.0 * a));
			return min(root1, root2) + " and " + max(root1, root2);
		} 
	}
}
