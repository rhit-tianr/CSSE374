import java.util.List;

public class Request {
	int userID;
	myDataBase mDb;
	Cart userCart;
	
	public Request(int userID, myDataBase db) {
		this.userID = userID;
		this.mDb = db;
		
	}
	
	public String handleViewCart(int userID, String shipState) {
		String a = userCart.viewCart(shipState);
		return null;
	}
	
	public String addItem(int itemID, int quantity) {
		this.userCart = mDb.userCart.get(userID);
		System.out.println("total: "+userCart.getTotalItemNum());
		return userCart.addItem(itemID, quantity);
	}

	public String applyDiscount(int itemID, String discount) {
		return userCart.applyDiscount(itemID, discount);
	}
}
