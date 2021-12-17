import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Cart {
	String shipState;
	static int totalNumItems;
	static double tax;
	static double totalCost;
	static double appliedDiscount;
	HashMap<String, Integer> itemQuantity = new HashMap<String, Integer>();
	myDataBase mDB = new myDataBase();
	int invalidDiscountNum;

	public Cart(int totalNumItems, double tax, double totalCost, double appliedDiscount) {
		this.totalNumItems = totalNumItems;
		this.tax = tax;
		this.totalCost = totalCost;
		this.appliedDiscount = appliedDiscount;
	}
	
	public String addItem(int itemID,int quantity) {
		String itemName = mDB.Inventory.get(itemID).itemName;
		int stock = mDB.Inventory.get(itemID).quantityInStock;
		if(quantity < stock) {
			itemQuantity.put(itemName, quantity);
			mDB.Inventory.get(itemID).quantityInStock = stock - quantity;
			return "Successfully add to cart!";
		}else {
			return "Cannot add to cart: " + itemName + " is out of stock";
		}
	}

	public String viewCart(String shipState) {
		this.shipState = shipState;

		return null;
	}
	
	public String applyDiscount() {
		return null;
	}

}
