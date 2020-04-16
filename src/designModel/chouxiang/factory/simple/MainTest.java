package designModel.chouxiang.factory.simple;

public class MainTest {

	public static void main(String[] args) {
		
		NorthFactory northFactory = new NorthFactory();
		 Fruite nApple = northFactory.getApple();
		 Fruite nBanana = northFactory.getBanana();
		nApple.get();
		nBanana.get();
		
		SouthFactory southFactory = new SouthFactory();
		Fruite sApple = southFactory.getApple();
		Fruite sBanana = southFactory.getBanana();
		sApple.get();
		sBanana.get();
	}
}
