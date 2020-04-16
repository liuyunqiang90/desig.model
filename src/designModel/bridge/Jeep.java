package designModel.bridge;

public class Jeep extends Car1{

	public Jeep(Engine engine) {
		super(engine);
	}

	@Override
	public void installEngine() {
		this.getEngine().installEngine();
	}

	
}
