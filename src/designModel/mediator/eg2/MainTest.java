package designModel.mediator.eg2;

public class MainTest {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
//		Person person = new Person(1,"qq",mediator);
		
		Man man = new Man(1,"qq",mediator);
		Woman woman = new Woman(1,"qq",mediator);
		man.getPartent(woman);
	}
}
