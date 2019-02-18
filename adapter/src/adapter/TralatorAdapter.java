package adapter;

public class TralatorAdapter implements VietnameseTarget {
	//adapter giữa adaptee không tương thích với interface không làm việc
	private JapaneseAdaptee adapte;
	public TralatorAdapter(JapaneseAdaptee adapte) {
		this.adapte = adapte;
	}
	 private String translate(String vietnameseWords) {
	        System.out.println("Translated!");
	        return "abcde";
	    }
	@Override
	public void send(String chuoi) {
		// TODO Auto-generated method stub
		System.out.println("Reading word");
		System.out.println(chuoi);
		String vietnameseWords = this.translate(chuoi);
		System.out.println("Sendding");
		adapte.receive(vietnameseWords);
	}
}
