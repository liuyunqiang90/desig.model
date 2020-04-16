package designModel.strategy;

public class Context {

	private StrategyInter strategy;

	public Context(StrategyInter strategy) {
		super();
		this.strategy = strategy;
	}
	
	public double getCost(double num){
		
		return this.strategy.cost(num);
	}
	
}
