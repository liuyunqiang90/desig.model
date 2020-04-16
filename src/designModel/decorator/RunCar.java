package designModel.decorator;
/**
 * 被装饰类，具体组件角色
 * @Description：
 * @author liuyunqiang
 * @date:   2019年4月7日 上午11:09:01
 */
public class RunCar implements Car {

	@Override
	public void show() {
		System.out.println("可以跑");
	}
}
