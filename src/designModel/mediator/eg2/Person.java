package designModel.mediator.eg2;

public abstract class Person {
	
	private int age;
	private String name;
	private Mediator mediator; 
	
	public Person(int age, String name, Mediator mediator) {
		super();
		this.age = age;
		this.name = name;
		this.mediator = mediator;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Mediator getMediator() {
		return mediator;
	}
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	public abstract void getPartent(Person person);

}
