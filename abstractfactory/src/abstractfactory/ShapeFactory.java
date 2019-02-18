package abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape createShape(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("Circle"))
			return new Circle();
		if(type.equalsIgnoreCase("Square"))
			return new Square();
		if(type.equalsIgnoreCase("Retangle"))
			return new Retangle();
		return null;
	}
}
