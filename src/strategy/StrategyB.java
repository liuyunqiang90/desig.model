package strategy;

public class StrategyB implements StrategyInter{

	@Override
	public double cost(double num) {
		if(num > 1000){
			return num * 0.9;
		}
		return num;
	}

}
