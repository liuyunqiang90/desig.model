package designModel.decorator;
//具体装饰角色
public class FlyCarDecorator extends CarDecorator{

	public FlyCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void show() {
		//调用原有car的功能，也就是基础功能
		this.getCar().show();
		this.fly();
	}

	//这是扩展出的功能
	public void fly() {
		System.out.println("可以飞。。。");
	}

}
