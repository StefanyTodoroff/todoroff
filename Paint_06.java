package stefany;
import java.util.Scanner;
public class Paint {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
		System.out.println("What is the height of the room?");
		double height = sc.nextDouble();
		System.out.println("What is the length of the room?");
		double length = sc.nextDouble();
		System.out.println("What is the width of the room?");
		double width = sc.nextDouble();

		int area = (int) Math.ceil(2 * height * length + 2 * height * width + width * length);
		int fiveLitersPrice = 15, oneLiterPrice = 4;
		int fiveLitersAreaCover = 140, oneLiterAreaCover = 30;
    int fiveLitersBuckets = 0,    int oneLiterBuckets = 0;
    fiveLitersBuckets += area / fiveLitersAreaCover;
    int areaLeft = area % fiveLitersAreaCover;
    oneLiterBuckets = areaLeft / oneLiterAreaCover + (( areaLeft % oneLiterAreaCover != 0) ? 1 : 0);
    if(oneLiterBuckets * oneLiterPrice > fiveLitersPrice) {
    oneLiterBuckets = 0;
    fiveLitersBuckets++;
    }


			System.out.println("You need " + fiveLitersBuckets + " five liter buckets and "
      + oneLiterBuckets + " one liter buckets");
				
	}
}
