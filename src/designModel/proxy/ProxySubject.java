package designModel.proxy;

public class ProxySubject implements Subject{

	private Subject subject;
	
	public ProxySubject(Subject subject) {
		super();
		this.subject = subject;
	}

	@Override
	public void sailBook() {
		dazhe();
		subject.sailBook();
		fanxian();
	}

	public void dazhe() {
		System.out.println("打折。。。");
	}
	
	public void fanxian() {
		System.out.println("返现");
	}
}
