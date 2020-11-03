package stefany;

public class Emirp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count = 0;
int number = 3;

while(count < 120 ) {
	int maxDivider = ( int )Math.ceil( Math.sqrt(number));
		boolean isPrime = true;
		for(int i = 2; i <= maxDivider; i++) {
			if( number % i == 0) {
				isPrime = false;
				break;
			}
	}
		if( ! isPrime ) {
			number++;
			continue;
		}
		int copyNumber = number;
		int reversedNumber = 0;
		while( copyNumber != 0)
		{
			int remainder = copyNumber % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			copyNumber /= 10;
		}
		
		boolean isPalindrome = number == reversedNumber;
		if(isPalindrome) {
			number++;
			continue;
		}
		
		maxDivider = (int) Math.ceil(Math.sqrt( reversedNumber ));
		
		
		for(int i = 2; i <= maxDivider; i++) {
			if( reversedNumber % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if( ! isPrime ) {
			number++;
			continue;
		}
		System.out.print(number + "\t");
		count++;
		number++;
		if(count % 10 == 0) {
			System.out.println();
		}
     }
  }
		
		public static boolean isPrime ( int aNumber ) {
		int maxDivider = ( int )Math.ceil( Math.sqrt(aNumber));
		boolean isPrime = true;
		for(int i = 2; i <= maxDivider; i++) {
			if( aNumber % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
		
		public static boolean isPalindrome(int aNumber ) {
			int copyNumber = aNumber;
			int reversedNumber = 0;
			while( copyNumber != 0)
			{ int remainder = copyNumber % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			copyNumber /= 10;
			}
			return aNumber == reversedNumber;
		}

}
