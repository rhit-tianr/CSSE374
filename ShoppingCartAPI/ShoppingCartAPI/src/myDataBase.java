import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class myDataBase {
	public HashMap<Integer, Cart> userCart = new HashMap<Integer, Cart>();
	public HashMap<Integer,ArrayList<String>> itemDiscountCodes = new HashMap<Integer,ArrayList<String>>();
	public HashMap<String, Discount>discounts = new HashMap<String, Discount>();
	public HashMap<String, LocalDate> discountExpireDate= new HashMap<String, LocalDate>();
	public HashMap<Integer, Item> Inventory = new HashMap<Integer, Item>();
}
