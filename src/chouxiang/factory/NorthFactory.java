package chouxiang.factory;

public class NorthFactory implements FruiteFactoryInter{

	@Override
	public Apple getApple() {
		return new NorthApple();
	}

	@Override
	public Banana getBanana() {
		return new NorthBanana();
	}

}
