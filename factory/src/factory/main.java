package factory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaptopFactory lap = new LaptopFactory();
		Laptop lapacer = lap.getStyle("acer");
		lapacer.xemLaptop();
		Laptop lapasus = lap.getStyle("asus");
		lapasus.xemLaptop();
		Laptop lapdell = lap.getStyle("dell");
		lapdell.xemLaptop();
	}
}
