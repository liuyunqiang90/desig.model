package designModel.observer;

import java.util.Observable;
/**
 * 这是被观察者，当被观察者状态发生改变的时候，需要通知观察者
 * @Description：
 * @author liuyunqiang
 * @date:   2019年4月7日 下午6:11:58
 */
public class Person extends Observable{

	private String name;
	private int age;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.setChanged();//super.setChanged();
		this.notifyObservers();
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
