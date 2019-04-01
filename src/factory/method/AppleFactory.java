package factory.method;

public class AppleFactory implements FactoryMethodInter {

	@Override
	public Fruite getFruite() {
		
		return new Apple();
	}

}
