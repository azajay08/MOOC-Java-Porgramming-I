
public class HealthStation {

	private int weighCount = 0;

	public int weigh(PersonHS person) {
		// return the weight of the person passed as the parameter
		this.weighCount++;
		return person.getWeight();
	}

	public void feed(PersonHS person) {
		person.setWeight(person.getWeight() + 1);
	}

	public int weighings() {
		return this.weighCount;
	}
}
