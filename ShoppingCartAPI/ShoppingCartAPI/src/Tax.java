
public class Tax {
	double money;
	String state;
	public Tax(double money, String state) {
		this.money = money;
		this.state = state;
	}
	
	public String calculateTax() {
		if(this.state.equals("WA")) {
			this.money = this.money * 1.0923;
		}else if(this.state.equals("OR")) {
			this.money = this.money * 1;
		}else if(this.state.equals("CA")) {
			this.money = this.money * 1.0868;
		}else if(this.state.equals("NV")) {
			this.money = this.money * 1.0823;
		}else if(this.state.equals("ID")) {
			this.money = this.money * 1.0603;
		}else if(this.state.equals("MT")) {
			this.money = this.money * 1;
		}else if(this.state.equals("WY")) {
			this.money = this.money * 1.0533;
		}else if(this.state.equals("UT")) {
			this.money = this.money * 1.0719;
		}else if(this.state.equals("AZ")) {
			this.money = this.money * 1.084;
		}else if(this.state.equals("CO")) {
			this.money = this.money * 1.0772;
		}else if(this.state.equals("NM")) {
			this.money = this.money * 1.0783;
		}else if(this.state.equals("TX")) {
			this.money = this.money * 1.0819;
		}else if(this.state.equals("OK")) {
			this.money = this.money * 1.0895;
		}else if(this.state.equals("KS")) {
			this.money = this.money * 1.0869;
		}else if(this.state.equals("NE")) {
			this.money = this.money * 1.0694;
		}else if(this.state.equals("SD")) {
			this.money = this.money * 1.064;
		}else if(this.state.equals("ND")) {
			this.money = this.money * 1.0696;
		}else if(this.state.equals("MN")) {
			this.money = this.money * 1.0746;
		}else if(this.state.equals("IA")) {
			this.money = this.money * 1.0694;
		}else if(this.state.equals("MO")) {
			this.money = this.money * 1.0825;
		}else if(this.state.equals("AR")) {
			this.money = this.money * 1.0951;
		}else if(this.state.equals("LA")) {
			this.money = this.money * 1.0952;
		}else if(this.state.equals("MS")) {
			this.money = this.money * 1.0707;
		}else if(this.state.equals("TN")) {
			this.money = this.money * 1.0955;
		}else if(this.state.equals("KY")) {
			this.money = this.money * 1.06;
		}else if(this.state.equals("IN")) {
			this.money = this.money * 1.07;
		}else if(this.state.equals("IL")) {
			this.money = this.money * 1.0882;
		}else if(this.state.equals("WI")) {
			this.money = this.money * 1.0543;
		}else if(this.state.equals("VT")) {
			this.money = this.money * 1.0624;
		}else if(this.state.equals("MI")) {
			this.money = this.money * 1.06;
		}else if(this.state.equals("OH")) {
			this.money = this.money * 1.0723;
		}else if(this.state.equals("AL")) {
			this.money = this.money * 1.0922;
		}else if(this.state.equals("FL")) {
			this.money = this.money * 1.078;
		}else if(this.state.equals("GA")) {
			this.money = this.money * 1.0732;
		}else if(this.state.equals("SC")) {
			this.money = this.money * 1.0746;
		}else if(this.state.equals("NC")) {
			this.money = this.money * 1.0698;
		}else if(this.state.equals("VA")) {
			this.money = this.money * 1.0573;
		}else if(this.state.equals("WV")) {
			this.money = this.money * 1.065;
		}else if(this.state.equals("PA")) {
			this.money = this.money * 1.0634;
		}else if(this.state.equals("NY")) {
			this.money = this.money * 1.0852;
		}else if(this.state.equals("ME")) {
			this.money = this.money * 1.055;
		}else if(this.state.equals("NH")) {
			this.money = this.money * 1;
		}else if(this.state.equals("MA")) {
			this.money = this.money * 1.0625;
		}else if(this.state.equals("RI")) {
			this.money = this.money * 1.07;
		}else if(this.state.equals("CT")) {
			this.money = this.money * 1.0635;
		}else if(this.state.equals("NJ")) {
			this.money = this.money * 1.066;
		}else if(this.state.equals("DE")) {
			this.money = this.money * 1;
		}else if(this.state.equals("MD")) {
			this.money = this.money * 1.06;
		}else if(this.state.equals("DC")) {
			this.money = this.money * 1.06;
		}else if(this.state.equals("AK")) {
			this.money = this.money * 1.0176;
		}else if(this.state.equals("HI")) {
			this.money = this.money * 1.0444;
		}else {
			return "Error: please pass state in correct format like 'IN'";
		}
		return Double.toString(this.money);	
	}
}
