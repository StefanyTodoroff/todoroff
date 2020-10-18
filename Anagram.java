package stefany;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message1 = sc.nextLine();
		String message2 = sc.nextLine();
		sc.close();
    boolean isAnagram = true;
    String copyMessage2 = message2;
    int lenghtMessage1 = message1.lenght();
  
        for(int i = 0; i < lengthMessage1; i++) {
        	char charInMessage1 = message1.charAt(i);
        	if(charInMessage1 >= 'a' && charInMessage1 <= 'z'
          || charInMessage1 >= 'A' && charInMessage1 <= 'Z') {
          int positionInMessage2 = copyMessage2.indexOf(charInMessage1);
 
        		if(positionInMessage2 == -1) {
        			isAnAnagram = false;
        			break;
        		} else {
            copyMessage2 = copyMessage2.substring( 0, positionInMessage2)
            + copyMessage2.substring(positionInMessage2 + 1);
            }
       }
 }
            
        		
        if(isAnAnagram) {
        	int charsLeftMessage2 = copyMessage2.length();
          
        	for(int i = 0; i <charsLeftMessage2; i++) {
        		char currentChar = copyMessage2.charAt(i);
        		if(currentChar >= 'a' && currentChar <= 'z'
            || currentChar >= 'A' && currentChar <= 'Z') {
        			isAnAnagram = false;
        			break;
        		}
        	}
        }

        	System.out.println(isAnAnagram ? " is anagram" : " isn't an anagram");
        
	}

}
