package designModel.decorator;

public class MainTest {

	public static void main(String[] args) {
		RunCar runCar = new RunCar();
		
		FlyCarDecorator flyCarDecorator = new FlyCarDecorator(runCar);
		flyCarDecorator.show();
		
		System.out.println("-------------");
		
		SwimCarDecorator swimCarDecorator = new SwimCarDecorator(flyCarDecorator);
		swimCarDecorator.show();
		System.out.println("---------------");
		SuperCar superCar = new SuperCar(swimCarDecorator);
		superCar.show();
	}
}
