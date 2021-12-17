import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class UnitTests {

	myDataBase mDB = new myDataBase();
	Item apple = new Item(1, "Apple", 10, "An edible fruit produced by an apple tree", 1.5, 1.5, "Apple.jpg");
	Item coke = new Item(2, "Coke", 15, "A carbonated soft drink", 2, 2, "Coke.jpg");
	Item phone = new Item(3, "Phone", 5, "A portable telephone that can make and receive calls over a radio frequency link", 500, 500, "Phone.jpg");
	
	@Test
	void viewCartTest() {
		int userID = 1;
//		Cart cart = new Cart("IN", 0, 0, 0, 0);
//		mDB.userCart.put(userID, cart);
		Cart cart = new Cart(0, 0.0, 0.0, 0);
		mDB.userCart.put(1, cart);
		System.out.println("test#1: view empty cart");
		System.out.println(mDB.userCart.get(1).totalCost);
		mDB.userCart.clear();
		
		mDB.Inventory.put(1, apple);
		System.out.println(mDB.Inventory.get(1).toStringList());
//		assertTrue();
	}

	
	@Test
	void addItemTest() {
	}

}

