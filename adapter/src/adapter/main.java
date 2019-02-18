package adapter;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  VietnameseTarget client = new TralatorAdapter(new JapaneseAdaptee());
	        client.send("Xin chao");
	}

}
