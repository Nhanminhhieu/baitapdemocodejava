package facade;

public class main {
	public static void main(String[] args) {
		Shopfacade shop = Shopfacade.getIntance();
		shop.buyProduct("abcd@gmail.com");
	}
}
