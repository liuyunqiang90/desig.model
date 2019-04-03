package chouxiang.factory;

public class SouthFactory implements FruiteFactoryInter {


	@Override
	public Apple getApple() {
		return new SouthApple();
	}

	@Override
	public Banana getBanana() {
		return new SouthBanana();
	}

}
