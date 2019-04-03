package simple.factory;

public class MainTest {

	public static void main(String[] args) {
		try {
			Fruite fruite = (Apple)SimpleFactory.getInstance("simple.factory.design.model.Apple");
			fruite.get();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
