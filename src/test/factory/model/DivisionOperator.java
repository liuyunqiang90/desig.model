package test.factory.model;

public class DivisionOperator implements Operate{

	@Override
	public double getResult(String num1, String num2) {
		if("0".equals(num2)){
			throw new RuntimeException("0 不能作除数");
		}
		return Double.parseDouble(num1) / Double.parseDouble(num2);
	}

}
