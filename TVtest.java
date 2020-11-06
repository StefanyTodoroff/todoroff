package stefany;

public class TVtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TV tv1 = new TV();
System.out.println( " channel " + tv1.channel + " volume " + tv1.volume + " on: " + tv1.on );
tv1.channelDown();
tv1.volumeUp();
	}

}
