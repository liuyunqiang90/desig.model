package observer.publish;

import java.util.Observable;

public class BlogUser extends Observable{
	
	
	public void pubish() {
		Article article = new Article("新文章", "你猜。。。");
		System.out.println("博主发布新文章了，题目是：" + article.getArticleTitle() + " ,内容是： " +article.getArticleContent());
		super.setChanged();
		super.notifyObservers(article);
	}

}
