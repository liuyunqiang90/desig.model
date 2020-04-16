package designModel.singleton.lazy;

public class Person {
	//懒汉式，是 非线程安全的
	private static Person person; 
	private Person() {
	}

	//造成线程不安全的原因是，当有多个线程同时调用getPerson时，可能同时进入11行；
	//解决方法，在方法上加synchronized 关键字，保证一次只有一个线程访问该方法，
	//但是会有效率问题
	public static Person getPersion() {
		if(person == null){
			person = new Person();
		}
		return person;
	}
}
