import java.time.LocalDate;

public class Discount {
	String discountCode;
	LocalDate expireDate;
	double disRate;
	LocalDate now = LocalDate.now();
	myDataBase mDB;
	int applyItemID;
	
	public Discount(int applyItemID, String discountCode, double disRate, LocalDate expireDate, myDataBase db) {
		this.applyItemID = applyItemID;
		this.discountCode = discountCode;
		this.disRate = disRate;
		this.expireDate = expireDate;
		this.mDB = db;
	}
	
	public boolean checkValid(int itemID, String discountCode) {
		boolean correctCode = mDB.itemDiscountCodes.get(itemID).contains(discountCode);
		boolean expired = now.compareTo(mDB.discounts.get(discountCode).expireDate) < 0;
		if(correctCode && !expired) {
			return true;
		}else {
			return false;
		}
	}

}
