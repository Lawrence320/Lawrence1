//Lawrence Luong
//September 25, 2019
//Period 4
//Takes the inputs from QuadraticClient and gives you the description of the graph

public class Quadratic {

	public static String quadDescriber(double a, double b, double c) {
		double symmetry = 0;
		double vertexX = 0;
		double vertexY = 0;
		double xSubtract = 0;
		double xAddition = 0;
		String xIntercepts = "";
		double yIntercepts = 0;
		String open = "";
		
		if(a < 0) {
			open = "Down";
		}else {
			open = "Up";
		}
		
		symmetry = (-(b)/(2*a));
		vertexX = symmetry;
		vertexY = (a*(square(vertexX)) + (b*vertexX) + c);
		yIntercepts = c;
		xSubtract = ((-b - squareRoot(discriminant(a, b, c)))/ (2*a));
		xAddition = ((-b + squareRoot(discriminant(a, b, c)))/ (2*a));
		if(xSubtract == xAddition) {
			xIntercepts = ("" + xSubtract);
		}else {
			xIntercepts = (xSubtract + " & " + xAddition);
		}
		String description = ("\n"
				+ "Description of the graph of: \n"
				+ "y = (" + a + ")x^2 + (" + b + ")x + (" + c +") \n\n"
				+ "Opens: " + open + "\n"
				+ "Axis of Symmetry: " + symmetry + "\n"
				+ "Vertex: (" + vertexX + "," + vertexY + ")" + "\n"
				+ "x intercept(s): " + xIntercepts + "\n"
				+ "y intercept: " + yIntercepts + "\n"
				+ "");
		return description;
	}
	public static double square(double number) {
		double answer = 0;
		answer = number * number;
		return answer;
	}
	public static double roundTo2DecimalPlaces(double num1) {
		int rounded = (int) (num1 / absValue(num1));
		int result = (int) absValue((int)(num1*1000));
		if(result % 10 >= 5) {
			return rounded * ((int) ((result + 10)/10))/100.0;
		}else {
			return rounded * (result/10)/100.0;
		}
	}
	public static double absValue(double num1) {
		if(num1 < 0) {
			num1 *= -1;
		}else {
			num1 *= 1;
		}
		return num1;
	}
	public static double discriminant(double number1, double number2, double number3) {
		double answer = 0; 
		answer = (number2 * number2 - 4 * number1 * number3);
		return answer;
	}
	public static double min(double num1, double num2) {
		if(num1 < num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		double maximum = max(num1 , max(num2, num3));
		return maximum;
	}
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
