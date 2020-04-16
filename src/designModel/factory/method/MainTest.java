package designModel.factory.method;

public class MainTest {

	public static void main(String[] args) {
		
		AppleFactory ff = new AppleFactory();
		Fruite apple = ff.getFruite();
		apple.get();
		
		BananaFactory ff2 = new BananaFactory();
		Fruite banana = ff2.getFruite();
		banana.get();
	}
}
