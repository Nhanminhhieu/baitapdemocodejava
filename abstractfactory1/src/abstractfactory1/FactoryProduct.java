package abstractfactory1;

public class FactoryProduct {

	public static AbstractFactoryProduct getFactory (String type) {
		if(type.equalsIgnoreCase("laptop"))
			return new FactoryLaptop();
		if(type.equalsIgnoreCase("xe"))
			return new FactoryXe();
		return null;
	}
}
