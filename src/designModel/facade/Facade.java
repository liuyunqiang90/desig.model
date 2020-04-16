package designModel.facade;

public class Facade {

	private SystemA systemA;
	private SystemB systemB;
	private SystemC systemC;
	public Facade() {
		systemA = new SystemA();
		systemB = new SystemB();
		systemC = new SystemC();
	}
	
	public void getABC() {
		systemA.A();
		systemB.B();
		systemC.C();
	}
	
}
