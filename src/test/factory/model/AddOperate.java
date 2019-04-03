package test.factory.model;

public class AddOperate implements Operate {

	@Override
	public double getResult(String num1, String num2) {
		
		return Double.parseDouble(num1) + Double.parseDouble(num2);
	}

}
