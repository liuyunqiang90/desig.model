package designModel.flyweight;

public class MainTest {

	public static void main(String[] args) {
		MyCharacter a = MyCharFactory.getCharacter('a');
		MyCharacter b = MyCharFactory.getCharacter('b');
		MyCharacter c = MyCharFactory.getCharacter('a');
		MyCharacter d = MyCharFactory.getCharacter('d');
		
		System.out.println(a == c);
	}
}
