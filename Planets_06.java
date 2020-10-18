package stefany;
import java.util.Scanner;

public class Planets_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter weight:");
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter planet of the solar system:");
		String planet = sc.nextLine();
		
		double convertigCoeff = 1;
		switch(planet) {
		case "Mercury": convertigCoeff = 0.38; break;
		case "Venus": convertigCoeff = 0.91; break;
		case "Mars": convertigCoeff = 0.38; break;
		case "Jupiter": convertigCoeff = 2.36; break;
		case "Saturn": convertigCoeff = 0.92; break;
		case "Uranus": convertigCoeff = 0.89; break;
		case "Neptune": convertigCoeff = 1.13; break;
		}
		System.out.println("Your weight on" + planet + " " + convertigCoeff * weight );
	}

}
