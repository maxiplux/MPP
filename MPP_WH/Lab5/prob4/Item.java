package prob4;

public class Item {
	String name;
	private Item(String name) {
		this.name = name;
	}
	
	static Item createItem(String name){
		return new Item(name);
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
