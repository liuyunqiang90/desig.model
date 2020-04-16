package designModel.prototype.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person implements Cloneable{

	private String name;
	private int age;
	private Date birthday;
	private List<String> friends;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	protected Object clone() {
		// 这是钱克隆
		// return super.clone();
		Person person = null;
		try {
			person = (Person) super.clone();
			person.birthday = (Date) person.getBirthday().clone();
//			 Date date = (Date) birthday.clone();
			// 因为List没有继承Cloneable接口，所以必须要新建一个
			List<String> newFriends = new ArrayList<>();
			for (String friend : person.getFriends()) {
				newFriends.add(friend);
			}
//			person.setBirthday(date);
			person.setFriends(newFriends);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return person;

	}
	
	
	
}
