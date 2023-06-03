
import java.util.ArrayList;

public class SimpleCollection {

	private String name;
	private ArrayList<String> elements;

	public SimpleCollection(String name) {
		this.name = name;
		this.elements = new ArrayList<>();
	}

	public void add(String element) {
		this.elements.add(element);
	}

	public ArrayList<String> getElements() {
		return this.elements;
	}

	public String toString() {
		String headerString = "";
		if (this.elements.isEmpty()) {
			return "The collection " + this.name + " is empty.";
		}
		if (this.elements.size() == 1) {
			headerString = "The collection " + this.name + " has " + this.elements.size() + " element:";
		} else {
			headerString = "The collection " + this.name + " has " + this.elements.size() + " elements:";
		}
		String elementsString = "";
		for (String element : this.elements) {
			elementsString += "\n";
			elementsString += element;
		}
		return headerString + elementsString;
	}

}
