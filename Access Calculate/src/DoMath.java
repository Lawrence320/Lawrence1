
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(2));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(5.0, 2.0));
		System.out.println(Calculate.average(2.0, 3.0, 4.0));
		System.out.println(Calculate.toDegrees(2.0));
		System.out.println(Calculate.toRadians(30.0));
		System.out.println(Calculate.discriminant(2.0, 3.0, 4.0));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3 ,6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(2, 3));
		System.out.println(Calculate.absValue(-11));
		System.out.println(Calculate.max(10, 11));
		System.out.println(Calculate.max(1,2,3));
		System.out.println(Calculate.min(1,2));
		System.out.println(Calculate.round2(35.456));
		System.out.println(Calculate.exponent(2, 4));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(3));
		System.out.println(Calculate.gcf(10, 15));
		System.out.println(Calculate.sqrt(6));
		System.out.println(Calculate.quadForm(1, 6, 9));
	}
}
