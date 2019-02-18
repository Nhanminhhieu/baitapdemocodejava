package factory;

public class LaptopFactory {
	public Laptop getStyle (String type) {
		if(type == null)
			return null;
		if(type.equalsIgnoreCase("acer"))
			return new LaptopAcer();
		if(type.equalsIgnoreCase("asus"))
			return new LaptopAsus();
		if(type.equalsIgnoreCase("dell"))
			return new LaptopDell();
		return null;
	}
}
