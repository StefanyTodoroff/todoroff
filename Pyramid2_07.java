package stefany;
import java.util.Scanner;
public class Pyramid2_07 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
		int numberOfRows = sc.nextInt();
	  for (int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < 1 ; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < numberOfRows - i; j++){
				System.out.print("*");
			};
			System.out.print();
		}
	}

}
