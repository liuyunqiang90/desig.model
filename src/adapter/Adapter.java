package adapter;
/**
 * 通过继承方式实现适配器模式
 * @Description：
 * @author liuyunqiang
 * @date:   2019年4月14日 下午12:07:15
 */
public class Adapter extends Current{

	public void user12V() {
		super.use220V();
	}
}
