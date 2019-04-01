package factory.method;
/**
 * 
 * @Description：
 * @author liuyunqiang
 * @date:   2019年4月1日 下午9:42:28
 * 工厂模式的核心，抽象工厂，所有工厂实现这个接口，当新增产品的时候，这个类不用改变
 * 只需要创建一个产品，以及对应的产品工厂既可以
 */
public interface FactoryMethodInter {

	Fruite getFruite();
	
}

