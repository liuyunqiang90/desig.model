package designModel.mediator.eg1;


public class Woman extends Person{

	public Woman(int age, String name) {
		super(age, name);
	}

	@Override
	public void getPartent(Person person) {
		if(person instanceof Woman){
			System.out.println("不行");
		}else {
			if(this.getAge() == person.getAge()){
				System.out.println("绝配");
			}
		}
	}

}
