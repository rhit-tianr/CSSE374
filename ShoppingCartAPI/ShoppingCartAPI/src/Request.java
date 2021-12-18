import java.util.List;

public class Request {
	int userID;
	myDataBase db;
	Cart userCart;
	
	public Request(int userID, myDataBase db) {
		this.userID = userID;
		this.db = db;
		this.userCart = db.userCart.get(userID);
	}
	
	public String handleViewCart(int userID, String shipState) {
		String a = userCart.viewCart(shipState);
		return null;
	}
	
	public String addItem(int itemID, int quantity) {
		System.out.println("req: "+itemID);
		return userCart.addItem(itemID, quantity);
	}

	public String applyDiscount(int itemID, String discount) {
		return userCart.applyDiscount(itemID, discount);
	}
}
