import java.util.ArrayList;

public class Hold {
	private int maxWeight;
	private ArrayList<Suitcase> suitcases;
	private int totalWeight;

	public Hold(int weight) {
		this.maxWeight = weight;
		this.suitcases = new ArrayList<>();
		this.totalWeight = 0;
	}

	public void addSuitcase(Suitcase suitcase) {
		if (suitcase.totalWeight() + this.totalWeight <= this.maxWeight) {
			this.suitcases.add(suitcase);
			this.totalWeight += suitcase.totalWeight();
		}
	}

	public String toString() {
		return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
	}

	public void printItems() {
		for (Suitcase suitcase : this.suitcases) {
			suitcase.printItems();
		}
	}
}
