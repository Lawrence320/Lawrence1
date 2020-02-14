//Lawrence Luong
//4th period
//9/22/19

public class Split {

	public static void main(String[] args) {
		System.out.println(part1("bread"));
		System.out.println(part1("breadcheesehambreadbread"));
		System.out.println(part1("hamhamhambread"));
		System.out.println(part1("breadbaconhamsausageeggcheesebread"));
		System.out.println(part2("bread ham sausage patty mayo mustard ketchup"));
		System.out.println(part2("bread ham cheese mayo bread"));
		System.out.println(part2("bread bread bread"));
	}
	
	public static String part1(String sandwich) {
		String[] output = sandwich.split("bread");
		if(output.length <= 1) {
			return "Not a sandwich";
		}
		int location = sandwich.indexOf("bread");
		if(location >= 0) {
			String leftover = sandwich.substring(location + 5);
			location = leftover.indexOf("bread");
			if(location >= 0) {
				return output[1];
			}else {
				return "Not a sandwich";
			}
		}else {
			return "Not a sandwich";
		}
	}
	
	public static String part2(String sandwich) {
		String[] output2 = sandwich.split(" ");
		String empty = "";
		for(int i = 0; i < output2.length; i++) {
			empty += output2[i];
		}
		return part1(empty);
	}
	// Your task Part 0

			//String.split();

			//It's a method that acts on a string, <StringName>.split(<sp>);

			//Where sp is the string where the string splits

			//And it returns an array

			// Example: "I like apples!".split(" ");

			// it will split at spaces and return an array of ["I","like","apples!"]

			// Example 2: "I really like really red apples!".split("really")

			// it will split at the word "really" and return an array of ["I "," like ","red apples!"]

			//play around with String.split!

			//What happens if you "I reallyreally likeapples".split("really") ?

			//Your task Part 1:

			/*Write a method that take in a string like

			* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

			* describing a sandwich.

			* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

			* the sandwich and ignores what's on the outside

			* What if it's a fancy sandwich with multiple pieces of bread?

			*/

			//Your task pt 2:

			/*Write a method that take in a string like

			* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

			* describing a sandwich

			* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

			* the sandwich and ignores what's on the outside.

			* Again, what if it's a fancy sandwich with multiple pieces of bread?

			*/
}

