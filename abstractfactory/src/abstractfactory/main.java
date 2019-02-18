package abstractfactory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shapeFactory = FactoryProducer.getFactory();
		Shape shape1 = shapeFactory.createShape("Square");
		shape1.draw();
	}
}
