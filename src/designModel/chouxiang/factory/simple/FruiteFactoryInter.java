package designModel.chouxiang.factory.simple;

/**
 * 同一个产品产品族不需要更改此接口，如果新增加一种水果，比如梨子，则需要在接口中添加得到梨子的方法；
 * 但是工厂方法却不需要更改顶层接口
 * @Description：
 * @author liuyunqiang
 * @date:   2019年4月3日 下午12:44:51
 */
public interface FruiteFactoryInter {

	Fruite getApple();
	Fruite getBanana();
}
