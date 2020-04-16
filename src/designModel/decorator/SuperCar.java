package designModel.decorator;

public class SuperCar extends CarDecorator{

	public SuperCar(Car car) {
		super(car);
	}

	@Override
	public void show() {
		this.getCar().show();
		this.superCar();
	}

	public void superCar() {
		System.out.println("神车。。。");
	}
}
