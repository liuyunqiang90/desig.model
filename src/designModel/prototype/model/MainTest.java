package designModel.prototype.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		Date date = new Date(2000, 2, 3);
		Person person1 = new Person();
		person1.setAge(18);
		person1.setName("小明");
		person1.setBirthday(date);
		person1.setFriends(list);
		
		Person person2 = (Person) person1.clone();
		person1.getFriends().add("4");
		person1.getBirthday().setDate(1990);
		System.out.println(person2.getFriends());
		System.out.println(person1.getBirthday());
		System.out.println(person2.getBirthday());
		System.out.println(person2.getBirthday() == person1.getBirthday());

	}

}
