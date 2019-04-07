package decorator;
/**
 * 装饰类，抽象装饰角色
 * @Description：
 * @author liuyunqiang
 * @date:   2019年4月7日 上午11:09:15
 */
public abstract class CarDecorator implements Car{

	private Car car;
	
	public CarDecorator(Car car) {
		super();
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
}
