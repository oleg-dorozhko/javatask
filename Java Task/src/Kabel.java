
public class Kabel {
	
	protected String company;
	protected String country;
	protected String switchType1;
	protected String switchType2;
	
	public Kabel(String company, String country, String sw1, String sw2) {
		this.company = company;
		this.country = country;
		this.switchType1 = sw1;
		this.switchType2 = sw2;
	}

	public String getSwitchType1() {
		
		return this.switchType1;
	}
	
	public String getSwitchType2() {
		
		return this.switchType2;
	}
	
}
