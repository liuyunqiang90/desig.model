package bridge;
/**
 * 如果做成抽象类，不能每一个实现子类都携带 Engine属性
 * @Description：
 * @author liuyunqiang
 * @date:   2019年4月13日 下午7:41:05
 */
public abstract class Car1 {

	private Engine engine;

	public Car1(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public abstract void installEngine();
}
