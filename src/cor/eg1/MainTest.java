package cor.eg1;

public class MainTest {

	public static void main(String[] args) {
		CarHeadHandler head = new CarHeadHandler();
		CarBodyHandler body = new CarBodyHandler();
		CarTailHandler tail = new CarTailHandler();
		head.setCarHandler(body);
		body.setCarHandler(tail);
		head.handlerCar();
		
		head.setCarHandler(body).setCarHandler(tail);
		head.handlerCar();
	}
}
