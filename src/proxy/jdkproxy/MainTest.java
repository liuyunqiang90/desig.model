package proxy.jdkproxy;

import java.lang.reflect.Proxy;

public class MainTest {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		JdkProxy jdkProxy = new JdkProxy(realSubject);
		Subject subject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
				RealSubject.class.getInterfaces(), jdkProxy);
		subject.sailBook("2");
	}
}
