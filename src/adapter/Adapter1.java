package adapter;

public class Adapter1 {

	private Current current;

	public Adapter1(Current current) {
		super();
		this.current = current;
	}
	
	public void use16V() {
		//调用之前可以做一些逻辑处理
		current.use220V();
	}
	
	
}
