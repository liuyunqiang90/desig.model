package designModel.mediator.eg2;


public class Man extends Person{

	
	public Man(int age, String name, Mediator mediator) {
		super(age, name, mediator);
	}

	@Override
	public void getPartent(Person person) {
		this.getMediator().setMan(this);
		this.getMediator().getPartner(person);
	}

}
