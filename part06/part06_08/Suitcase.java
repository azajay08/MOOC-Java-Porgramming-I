import java.util.ArrayList;


public class Suitcase {
	private ArrayList<Item> items;
	private int totalWeight;
	private int maxWeight;

	public Suitcase(int weight) {
		this.items = new ArrayList<>();
		this.totalWeight = 0;
		this.maxWeight = weight;
	}

	public void addItem(Item item) {
		if (item.getWeight() + this.totalWeight <= this.maxWeight) {
			this.items.add(item);
			this.totalWeight += item.getWeight();
		}
	}

	public String toString() {
		if (this.items.isEmpty()){
			return "no items (0 kg)";
		}
		if (this.items.size() == 1) {
			return this.items.size() + " item (" + this.totalWeight + " kg)";
		}
		return this.items.size() + " items (" + this.totalWeight + " kg)";
	}

	public void printItems() {
		for (Item item : items) {
			System.out.println(item);
		}
	}

	public int totalWeight() {
		return this.totalWeight;
	}

	public Item heaviestItem() {
		if (this.items.isEmpty()) {
			return null;
		}
		Item heaviest = this.items.get(0);
		for (Item item : this.items) {
			if (item.getWeight() > heaviest.getWeight()) {
				heaviest = item;
			}
		}
		return heaviest;
	}
}
