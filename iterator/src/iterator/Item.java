package iterator;

public class Item {
	private String name;
	private String detail;
	
	public Item(String name, String detail) {
		super();
		this.name = name;
		this.detail = detail;
	}

//	@Override
//	public String toString() {
//		return "Item [name=" + name + ", detail=" + detail + "]";
//	}
	public void xuat(Item item) {
		System.out.println(item.name + "----" + item.detail);
	}

}
