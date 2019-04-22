package cor.eg1;

public class CarBodyHandler extends CarHandler{

	@Override
	public void handlerCar() {
		System.out.println("装车身");
		if(this.carHandler != null){
			this.carHandler.handlerCar();
		}
	}

}
