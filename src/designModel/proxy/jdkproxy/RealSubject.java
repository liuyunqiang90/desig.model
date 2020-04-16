package designModel.proxy.jdkproxy;

public class RealSubject implements Subject{

	@Override
	public void sailBook(String num) {
		System.out.println("卖书。。。" + num);
	}

}
