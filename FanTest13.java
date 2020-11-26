package stefany;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1 = new Fan();
		f1.setSpeed(Fan.FAST);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setSwitchedOn(true);
		System.out.println("First fan:");
		System.out.println(f1.toString(f1.getSpeed(), f1.getRadius(), f1.getSwitchedOn(), f1.getColor()));
		
		Fan f2 = new Fan();
		f2.setSpeed(Fan.MEDIUM);
		f2.setRadius(5);
		f2.setColor("blue");
		f2.setSwitchedOn(false);
		System.out.println("Second fan:");
		System.out.println(f2.toString(f2.getSpeed(), f2.getRadius(), f2.getSwitchedOn(), f2.getColor()));
		
	}

}
