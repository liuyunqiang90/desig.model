package proxy;

public class MainTest {

	public static void main(String[] args) {
		
		ProxySubject proxySubject = new ProxySubject(new RealSubject());
		proxySubject.sailBook();
	}
}
