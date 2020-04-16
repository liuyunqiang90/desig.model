package designModel.cor.eg1;

public abstract class CarHandler {

	protected CarHandler carHandler;
	
	public CarHandler setCarHandler(CarHandler carHandler) {
		return this.carHandler = carHandler;
	}

	public abstract void handlerCar();
	
}
