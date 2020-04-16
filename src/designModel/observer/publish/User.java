package designModel.observer.publish;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		Article article = (Article)arg;
		System.out.println("博主发布新文章，快去踩。。。。。" + article.getArticleTitle());
	}

}
