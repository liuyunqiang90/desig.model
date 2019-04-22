package bridge;

public class Bus implements Car{
	private Engine engine;

	
	public Bus(Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public void installEngine() {
		this.engine.installEngine();
		
	}

}
