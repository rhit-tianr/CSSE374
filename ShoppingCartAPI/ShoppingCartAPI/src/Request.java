import java.util.List;

public class Request {
	private int userID;
	private String shipState;
	private myDataBase db;
	Cart userCart = db.userCart.get(userID);
	
	public Request(int userID, String shipState, myDataBase db) {
		this.userID = userID;
		this.shipState = shipState;
		this.db = db;
	}
	
	public String handleViewCart(int userID, String shipState) {
		String a = userCart.viewCart(this.shipState);
		return null;
	}
	
	public String addItem(int itemID, int quantity) {
		return userCart.addItem(itemID, quantity);
	}

}
