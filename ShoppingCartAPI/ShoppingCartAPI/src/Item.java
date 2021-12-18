import java.awt.Image;

public class Item {
	int itemID;
	String itemName;
	int quantityInStock;
	String description;
	double price;
	double discountedPrice;
	String picture;
	myDataBase mDB;
	public Item(int itemID, String itemName, int quantityInStock, String description, double price, double discountedPrice, String picture, myDataBase mDB){
		this.itemID = itemID;
		this.itemName = itemName;
		this.quantityInStock = quantityInStock;
		this.description = description;
		this.price = price;
		this.discountedPrice = discountedPrice;
		this.picture = picture;
		this.mDB = mDB;
	}
	
	public String getName(int id) {
		return this.mDB.Inventory.get(id).itemName;
	}
	
	public int getQuantityInStock(int id) {
		return this.mDB.Inventory.get(id).quantityInStock;
	}
	
	public String getDescription(int id) {
		return this.mDB.Inventory.get(id).description;
	}
	
	public double getPrice(int id) {
		return this.mDB.Inventory.get(id).price;
	}
	
	public double getDiscountedPrice() {
		this.discountedPrice = this.price*(1-mDB.discounts.get(itemID).disRate);
		return this.discountedPrice;
	}
	
	public String toStringList() {
		String content = "Name: "+ itemName +"; Quantity in Stock: " + quantityInStock + "; Description: " + description + "; Price: " + price +"; PriceAfterDiscount: " + discountedPrice; 
		return content;
	}

}
