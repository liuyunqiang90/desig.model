package designModel.cor.eg1;

public class CarHeadHandler extends CarHandler{

	@Override
	public void handlerCar() {
		System.out.println("装车头");
		if(this.carHandler != null){
			this.carHandler.handlerCar();
		}
	}

}
