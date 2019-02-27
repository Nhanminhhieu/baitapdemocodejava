package abstractfactory1;

public class FactoryXe extends AbstractFactoryProduct {

	@Override
	public Laptop createLaptop(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Xe createXe(String type) {
		if(type.equalsIgnoreCase("honda"))
			return new XeHonda();
		if(type.equalsIgnoreCase("sh"))
			return new XeSH();
		return null;
	}

}
