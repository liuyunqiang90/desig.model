package observer.publish;

public class MainTest {

	public static void main(String[] args) {
		BlogUser blogUser = new BlogUser();
		
		blogUser.addObserver(new User());
		blogUser.pubish();
	}
}
