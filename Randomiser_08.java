package stefany;

import java.util.Scanner;

public class Randomiser_08 {

	public static void main(String[] args) {
  int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
        array[i] = sc.nextInt();
     }
     for( int i = 0; i <10; i++) {
         int randomIndex = (int) (Math.random() * 10);
         int swap = array[randomIndex];
         array[randomIndev] = array[i];
         array[i] = swap;
      }
      for(int i = 0; i < 10; i++) {
           System.out.println(array[i]);
      }
   }
}
