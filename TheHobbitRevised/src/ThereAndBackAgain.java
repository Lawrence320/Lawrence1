//Lawrence Luong
//APCS 4th
//Inheritance practice code
//Started 2/5/2020


import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThereAndBackAgain {

	public static void main(String[] args) {
		
		Hobbit frodo = new Hobbit("Frodo");
		Hobbit sam = new Hobbit("Sam");
		Dwarf gimli = new Dwarf("Gimli");
		Traveler[] party1 = {frodo, sam, gimli};
		for(Traveler person : party1) {
			person.travel(50);
			System.out.println(person.getName() + " has traveled " + person.getDistanceTraveled() + " miles.");
		}
		// Create a traveling party called party1 by creating an array of Travelers 
		// and filling it with frodo, sam, and gimli
		// Then, use a loop to make all travelers go a distance of 50 miles  
		// Then, for each Traveler in the travelingParty, print their name and how far they've
		//    traveled in miles.  (In the next piece, you'll do this in methods, but 
		//    for a first pass, just do it in main and print to the console.)
		// Expected output:  Frodo has traveled 50 miles.
		//                   Sam has traveled 50 miles.
		//                   Gimli has traveled 50 miles.
		System.out.println();
		System.out.println("\n\n\nPART 2: \n");

		String[] dwarfNames = {"Fili", "Kili", "Dori", "Ori", "Nori", "Balin", "Dwalin", 
		"Oin", "Gloin", "Bifur", "Bofur", "Bombur", "Thorin"};

		// Make a new ArrayList to hold a 2nd party of Travelers called party2:
		ArrayList<Traveler> party2 = new ArrayList<Traveler>();
		Hobbit Bilbo = new Hobbit("Bilbo");
		party2.add(Bilbo);
		Wizard Gandalf = new Wizard("Gandalf", "Grey");
		party2.add(Gandalf);
		createParty(party2, dwarfNames);
		allTravel(party2, 100);
		// Make a new Hobbit called "Bilbo" and add him to party2
		
		// Make a new Wizard called "Gandalf" and add him to party2.

		
		//write createParty
		// Call the createParty method and pass it party2 and the dwarfNames array.

		// create party should add all the new dwarves to party2,

		//Write allTravel
		// Finally, call the allTravel method passing it party2 and 100 (representing
		// the 100 miles that party2 has traveled together.

		//Make sure your code prints out the name and distances party2 has traveled.

	}
	//adds the dwarfs to party2
	public static ArrayList<Traveler> createParty(ArrayList<Traveler> group, String[] names){
		for(String i : names) {
			Dwarf newTraveler = new Dwarf(i);
			group.add(newTraveler);
		}
		return group;
	}
	//prints out how many miles has each traveler traveled
	public static void allTravel(ArrayList<Traveler> group, int miles) {
		for(Traveler person : group) {
			person.travel(miles);
			System.out.println(person.getName() + " has traveled " + person.getDistanceTraveled() + " miles.");
		}
	}
}
