package designModel.interpreter;

public class MinusExpression implements Expression{

	@Override
	public void interpreter(Context context) {
		int input = context.getInput();
		input--;
		context.setInput(input);
		context.setOutput(input);
	}

}
