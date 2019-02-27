package abstractfactory1;

public abstract class AbstractFactoryProduct {
	public abstract Laptop createLaptop(String type);
	public abstract Xe createXe(String type);
}
