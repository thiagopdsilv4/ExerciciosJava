package entities;

public class Product {

	String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {//executa no momento da execu��o. CONSTRUTOR
		this.name = name; //this = refer�ncia para o pr�prio objeto;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {//executa no momento da execu��o. CONSTRUTOR
		this.name = name; //this = refer�ncia para o pr�prio objeto;
		this.price = price;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {//M�TODO
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unidades, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
