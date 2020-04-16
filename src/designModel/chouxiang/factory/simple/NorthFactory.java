package designModel.chouxiang.factory.simple;

public class NorthFactory implements FruiteFactoryInter{

	@Override
	public Fruite getApple() {
		return new NorthApple();
	}

	@Override
	public Fruite getBanana() {
		return new NorthBanana();
	}

}
