package abstractfactory1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactoryProduct prdt = FactoryProduct.getFactory("laptop");
		prdt.createLaptop("acer").xuatTT();;
	}

}
