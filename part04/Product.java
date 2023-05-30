public class Product {
	private Double price;
	private int quantity;
	private String name;

	public Product (String initialName, double initialPrice, int initialQuantity) {
		this.name = initialName;
		this.price = initialPrice;
		this.quantity = initialQuantity;
	}

	public void printProduct() {
		System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
	}
}

/*
 * 
 * Main 
 * public class Main {

    public static void main(String[] args) {
		// This is an empty main method for testing the Product class
		// Try:

		Product product = new Product("Banana", 1.1, 13);
		product.printProduct();
	}
}
 */