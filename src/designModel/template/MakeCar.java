package designModel.template;

public abstract class MakeCar {

	public abstract void makeHead();
	
	public abstract void makeTail();
	
	public abstract void makeBody();
	
	public void make() {
		this.makeBody();
		this.makeHead();
		this.makeTail();
	}
}
