package mediator.eg2;

public class Mediator {

	private Man man;
	private Woman woman;
	public Man getMan() {
		return man;
	}
	public void setMan(Man man) {
		this.man = man;
	}
	public Woman getWoman() {
		return woman;
	}
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	
	public void getPartner(Person person) {
		if(person instanceof Man){
			this.setMan((Man)person);
		}else {
			this.setWoman((Woman)person);
		}
		
		if(man.getAge() == woman.getAge()){
			System.out.println("绝配");
		}else {
			 System.out.println("不配");
		}
	}
}
