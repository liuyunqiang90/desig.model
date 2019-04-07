package strategy;

public class StrategyA implements StrategyInter{

	@Override
	public double cost(double num) {
		return num * 0.8;
	}

}
