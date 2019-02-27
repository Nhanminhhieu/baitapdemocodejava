package interpreter;

public class AddExpression implements Expression{

	@Override
	public int interpret(InterpreterEnginContext context) {
		// TODO Auto-generated method stub
		return context.add();
	}

}
