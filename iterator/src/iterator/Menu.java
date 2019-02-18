package iterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<Item> menuItems = new ArrayList<>();
	
	public void addItem (Item item) {
		menuItems.add(item);
	}
	
	public ItemIterator<Item> itemIterator() {
		return new ItemIterator<Item>() {
			private int currentIndex = 0;
			@Override
			public Item next() {
				// TODO Auto-generated method stub
				return menuItems.get(currentIndex++);
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return currentIndex < menuItems.size();
			}
		};
	}
}
