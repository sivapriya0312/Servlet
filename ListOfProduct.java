
package ListOfProduct;

public class ListOfProduct {

	int id;
	private String nameOfProduct;
	private double price;

	public ListOfProduct(int id, String nameOfProduct, double price) {
		this.id = id;
		this.nameOfProduct = nameOfProduct;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getNameOfProduct() {
		return nameOfProduct;
	}

	public double getPrice() {
		return price;
	}

	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	public void setid(int id) {
		this.id = id;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public String toString() {
		return String.format("ListOfProduct{id = '%d', nameOfProduct = '%s',price='%s'}", id, nameOfProduct, price);
	}
}
