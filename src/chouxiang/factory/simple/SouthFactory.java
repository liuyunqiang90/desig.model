package chouxiang.factory.simple;

public class SouthFactory implements FruiteFactoryInter {


	@Override
	public Fruite getApple() {
		return new SouthApple();
	}

	@Override
	public Fruite getBanana() {
		return new SouthBanana();
	}

}
