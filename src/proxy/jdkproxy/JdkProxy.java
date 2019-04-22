package proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler{

	private Subject subject;
	
	public JdkProxy(Subject subject) {
		super();
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		dazhe();
		Object invoke = method.invoke(subject, args);
		fanxian();
		return invoke;
	}

	public void dazhe() {
		System.out.println("打折。。。");
	}
	
	public void fanxian() {
		System.out.println("返现...");
	}
}
