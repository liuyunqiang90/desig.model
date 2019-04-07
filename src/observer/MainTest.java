package observer;

public class MainTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.addObserver(new MyObserver());
		person.setName("lisi");
	}
}
