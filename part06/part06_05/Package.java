import java.util.ArrayList;

public class Package {

	private ArrayList<Gift> parcel = new ArrayList<>();

	public Package() {
		this.parcel = new ArrayList<>();
	}

	public void addGift(Gift gift) {
		this.parcel.add(gift);
	}

	public int totalWeight() {
		int weight = 0;
		for (Gift gift : this.parcel) {
			weight += gift.getWeight();
		}
		return weight;
	}
}
