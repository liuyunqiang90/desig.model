package flyweight;

public class MyCharacter {

	private char mychar;

	
	public MyCharacter(char mychar) {
		super();
		this.mychar = mychar;
	}

	public char getMychar() {
		return mychar;
	}

	public void setMychar(char mychar) {
		this.mychar = mychar;
	}

	@Override
	public String toString() {
		return "MyCharacter [mychar=" + mychar + "]";
	}
	
	
}
