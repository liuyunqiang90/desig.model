package designModel.chouxiang.factory;

public class MainTest {

	public static void main(String[] args) {
		
		NorthFactory northFactory = new NorthFactory();
		Apple nApple = northFactory.getApple();
		Banana nBanana = northFactory.getBanana();
		nApple.get();
		nBanana.get();
		
		SouthFactory southFactory = new SouthFactory();
		Apple sApple = southFactory.getApple();
		Banana sBanana = southFactory.getBanana();
		sApple.get();
		sBanana.get();
	}
}
