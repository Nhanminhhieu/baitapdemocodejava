package iterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.addItem(new Item("a", "aaaaaa"));
		menu.addItem(new Item("b", "bbbbbb"));
		menu.addItem(new Item("c", "cccccc"));
		menu.addItem(new Item("d", "dddddd"));
		ItemIterator<Item> itemIterator = menu.itemIterator();
		while(itemIterator.hasNext()) {
			Item item = itemIterator.next();
			item.xuat(item);
		}
	}

}
