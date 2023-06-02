public class Fitbyte {
	private int age;
	private int restHr;

	public Fitbyte(int age, int restingHeartRate) {
		this.age = age;
		this.restHr = restingHeartRate;
	}

	public double targetHeartRate(double percentageOfMaximum) {
		double maxHr = 206.3 - (0.711 * this.age);
		return ((maxHr - this.restHr) * (percentageOfMaximum) + this.restHr);
	}
}
