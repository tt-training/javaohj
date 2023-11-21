package fi.tieturi;

public class Polymorfismi extends Object implements Rajapinta {
	public static void main(String[]a) {
		
		Object o1 = "Stringi";
		Object o2 = Integer.valueOf(4);
		
		o1.equals("Stringi");
		o2.equals("Stringi");
		
		((String)o1).concat("asdsa");
	}

	@Override
	public void teeJotain() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teeMuuta() {
		// TODO Auto-generated method stub
		
	}
}
