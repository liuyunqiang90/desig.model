package singleton.hugry;

public class Person {
	//饿汉式，是线程安全的
	private static final Person PERSON = new Person();
	private Person() {
	}

	public static Person getPersion() {
		
		return PERSON;
	}
}
