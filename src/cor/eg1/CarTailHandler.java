package cor.eg1;

public class CarTailHandler extends CarHandler{

	@Override
	public void handlerCar() {
		System.out.println("装车尾");
		if(this.carHandler != null){
			this.carHandler.handlerCar();
		}
	}

}
