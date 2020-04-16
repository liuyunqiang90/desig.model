package designModel.strategy;

public class MainTest {

	public static void main(String[] args) {
		
		//客户端必须知道有多少算法策略
		Context context = new Context(new StrategyA());
		System.out.println(context.getCost(100));
	}
}
