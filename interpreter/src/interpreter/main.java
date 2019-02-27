package interpreter;

public class main {
	public static void main(String[] args) {
		Expression exp = new AddExpression();		
		System.out.println(exp.interpret(new InterpreterEnginContext()));
	}
}
