package designModel.test.factory.model;

public class AddFactory implements OperateFactoryInter{


	@Override
	public Operate getOperate() {
		
		return new AddOperate();
	}

}
