package proxy;

public class RealSubject implements Subject{

	@Override
	public void sailBook() {
		System.out.println("卖书。。。");
	}

}
