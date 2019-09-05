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
		return (number3 * number1 + number2) + "/" + number3;
	}
	
	public static String toMixedNum(int number1, int number2) {
		int whole = number1 / number2;
		int numerator = number1 % number2;
		return whole + "_" + numerator + "/" + number2;
	}
}
