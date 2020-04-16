package designModel.test.factory.model;

public class DivisionFactory implements OperateFactoryInter {

	@Override
	public Operate getOperate() {
		
		return new DivisionOperator();
	}

}
