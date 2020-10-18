package stefany;

public class RandomArray_08 {
	public static void main(String[] args) {
	double rand;
		int[] randomArray = new int[20];
		for(int i = 0; i < 20; i++){
			randomArray = (int) (Math.random() * 20 ) + 1;
			}
      for( int i = 0; i < 20; i++) {
			System.out.println(randomArray[i]);
		}
	}
}
