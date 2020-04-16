package designModel.factory.method;

public class BananaFactory implements FactoryMethodInter {

	@Override
	public Fruite getFruite() {
		
		return new Banana();
	}

}
