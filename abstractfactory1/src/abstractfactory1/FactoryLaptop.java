package abstractfactory1;

public class FactoryLaptop extends AbstractFactoryProduct{

	@Override
	public Laptop createLaptop(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("acer"))
			return new LaptopAcer();
		if(type.equalsIgnoreCase("asus"))
			return new LaptopAsus();
		return null;
	}

	@Override
	public Xe createXe(String type) {
		// TODO Auto-generated method stub
		return null;
	}



}
