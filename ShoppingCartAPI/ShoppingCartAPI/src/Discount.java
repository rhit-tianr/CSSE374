import java.time.LocalDate;

public class Discount {
	LocalDate expireDate;
	double disRate;
	LocalDate now = LocalDate.now();
	
	public Discount(double disRate, LocalDate expireDate) {
		this.disRate = disRate;
		this.expireDate = expireDate;
	}
	
	public boolean checkValid() {
		if(now.compareTo(expireDate)>0) {
			return false;
		}else {
			return true;
		}
	}

}
