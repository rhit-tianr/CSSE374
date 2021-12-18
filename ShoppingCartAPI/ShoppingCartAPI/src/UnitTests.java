import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class UnitTests {

	myDataBase mDB = new myDataBase();
	int userID = 1;
	Item apple = new Item(1, "Apple", 10, "An edible fruit produced by an apple tree", 1.5, 1.5, "Apple.jpg", mDB);
	Item coke = new Item(2, "Coke", 15, "A carbonated soft drink", 2, 2, "Coke.jpg", mDB);
	Item phone = new Item(3, "Phone", 5, "A portable telephone that can make and receive calls over a radio frequency link", 500, 500, "Phone.jpg", mDB);
	Discount appleDis = new Discount(1, "APPLEDIS", 0.1, LocalDate.of(2021, 06, 22), mDB);
	Discount phoneDis1 = new Discount(5, "PHONEDIS1", 0.3, LocalDate.of(2022, 03, 12), mDB);
	Discount phoneDis2 = new Discount(5, "PHONEDIS2", 0.2, LocalDate.of(2022, 11, 11), mDB);
	Request req = new Request(userID, mDB);
	
	
	@Test
	void viewCartTest() {

		Cart cart = new Cart(0, 0.0, 0.0, 0, mDB);
		mDB.userCart.put(1, cart);
		System.out.println("test#1: view empty cart");
		System.out.println(mDB.userCart.get(1).totalCost);
		mDB.userCart.clear();
		
		mDB.Inventory.put(1, apple);
		System.out.println(mDB.Inventory.get(1).toStringList());

	}

	
	@Test
	void addItemTest() {
		Cart cart = new Cart(0, 0.0, 0.0, 0, mDB);
		
		mDB.userCart.put(userID, cart);
		mDB.Inventory.put(1, apple);
		mDB.Inventory.put(2, coke);
		String addCoke = req.addItem(2, 3);
		String result1 = addCoke.substring(0, 10);
		System.out.println("result1: " + result1);
		int cokeQuantity = mDB.userCart.get(userID).itemQuantity.get("Coke");
		int totalQuantity1 = mDB.userCart.get(userID).getTotalItemNum();
		System.out.println("tq1: "+totalQuantity1);
		System.out.println("cost1: "+mDB.userCart.get(userID).getTotalCost());
		assertTrue(totalQuantity1 == 3);
		assertTrue(cokeQuantity == 3);
		assertTrue(result1.equals("Successful"));
		
		
		String addApple = req.addItem(1, 20);
		String result2 = addApple.substring(0,6);
		System.out.println("result2: " + result2);
		int totalQuantity2 = mDB.userCart.get(userID).getTotalItemNum();
		System.out.println("tq2: "+totalQuantity2);
		System.out.println("cost2: "+mDB.userCart.get(userID).getTotalCost());
		assertTrue(totalQuantity2 == 3);
		assertTrue(result2.equals("Cannot"));
		assertFalse(mDB.userCart.get(userID).itemQuantity.containsKey("Apple"));
	}
	
	@Test
	void applyDiscountTest() {
		int userID = 2;
		Cart cart = new Cart(0, 0.0, 0.0, 0, mDB);
		mDB.userCart.put(userID, cart);
		mDB.Inventory.put(1, apple);
		mDB.Inventory.put(2, coke);
		mDB.Inventory.put(3, phone);
		mDB.discounts.put(appleDis.discountCode, appleDis);
		mDB.discounts.put(phoneDis1.discountCode, phoneDis1);
		mDB.discounts.put(phoneDis2.discountCode, phoneDis2);
		
	}
	
	@Test
	void changeCartQuantityTest() {
		
	}

}

