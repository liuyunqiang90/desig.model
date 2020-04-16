package designModel.mediator.eg2;


public class Woman extends Person{


	public Woman(int age, String name, Mediator mediator) {
		super(age, name, mediator);
	}

	@Override
	public void getPartent(Person person) {
		this.getMediator().setWoman(this);
		this.getMediator().getPartner(this);
	}

}
