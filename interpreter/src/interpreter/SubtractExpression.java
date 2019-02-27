package interpreter;

public class SubtractExpression implements Expression {

	@Override
	public int interpret(InterpreterEnginContext context) {
		// TODO Auto-generated method stub
		return context.substract();
	}

}
