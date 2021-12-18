import java.util.HashMap;

public class Cart {
	String shipState;
	int totalNumItems;
	double tax;
	double totalCost;
	double appliedDiscount;
	HashMap<String, Integer> itemQuantity = new HashMap<String, Integer>();
	myDataBase mDB;
	int invalidDiscountNum;

	public Cart(int totalNumItems, double tax, double totalCost, double appliedDiscount, myDataBase mDB) {
		this.totalNumItems = totalNumItems;
		this.tax = tax;
		this.totalCost = totalCost;
		this.appliedDiscount = appliedDiscount;
		this.mDB = mDB;
	}
	
	public String addItem(int itemID,int quantity) {
		String itemName = mDB.Inventory.get(itemID).itemName;
		int stock = mDB.Inventory.get(itemID).quantityInStock;
		if(quantity < stock) {
			itemQuantity.put(itemName, quantity);
			mDB.Inventory.get(itemID).quantityInStock = stock - quantity;
			this.totalNumItems += quantity;
			totalCost += mDB.Inventory.get(itemID).price * quantity;
			return "Successfully add to cart!";
		}else {
			return "Cannot add to cart: " + itemName + " is out of stock";
		}
	}

	public String viewCart(String shipState) {
		this.shipState = shipState;
		
		return null;
	}
	
	public String applyDiscount(int itemID, String code) {
		if(mDB.discounts.containsKey(code)) {
			if(mDB.discounts.get(code).checkValid(itemID, code)) {
				return "";
			}else {
				invalidDiscountNum--;
				if(invalidDiscountNum == 0) {
					return "You have enter more than 5 invalid discount, no further discount will applied in next 24 hours!";
				}
				return "Expired Discount!";
			}
		}else {
			invalidDiscountNum--;
			if(invalidDiscountNum == 0) {
				return "You have enter more than 5 invalid discount, no further discount will applied in next 24 hours!";
			}
			return "Invalid discount";
		}
	}
	
	public int getTotalItemNum() {
		return this.totalNumItems;
	}
	
	public double calculateTax() {
		double costBfTax = this.totalCost-this.appliedDiscount;
		Tax cartTax = new Tax(costBfTax,this.shipState);
		this.tax = Double.parseDouble(cartTax.calculateTax());
		return this.tax;
	}
	
	public double getTotalCost() {
		return this.totalCost;
	}
	
	public double updateTotalCost() {
		double result = this.totalCost-this.appliedDiscount + this.tax;
		return result;
	}

}
