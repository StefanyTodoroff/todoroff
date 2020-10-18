
package stefany;

import java.util.Scanner;

public class Test_08 {
	public static void main(String[] args) {
		final int NUMBER_STUDENTS = 2;
		final int NUMBER_QUESTIONS = 2;
		char[][] answers = new char [NUMBER_STUDENTS][NUMBER_QUESTIONS];
		char[] keys = new char[NUMBER_QUESTIONS];
				Scanner sc = new Scanner(System.in);

		for(int j = 0; j < NUMBER_QUESTIONS; j++){
			System.out.println("Enter answer for questions " + ( j + 1 ));
			keys [j] = sc.nextLine().charAt(0);
		}
		
		for(int i = 0; i < NUMBER_STUDENTS; i++){
			for(int j = 0; j < NUMBER_QUESTIONS; j++) {
			System.out.println(" Enter answer for question" + ( j + 1 ) + " for student " + ( i + 1));
			answers[i][j] = sc.nextLine().charAt(0);
		}
	}
		for(int i = 0; i < NUMBER_STUDENTS; i++){
			int correctCount = 0;
			for(int j = 0; j < NUMBER_QUESTIONS; j++) {
				if(answers[i][j] == keys[j]) {
					correctCount++;
			    }
	        }
			System.out.println(" Student " + i + " 's correct count is " + correctCount);
		}
    }
}
