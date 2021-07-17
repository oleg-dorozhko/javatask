public abstract class Technika {
	protected String company;
	protected String country;
	protected String switchType;

	public Technika(String company, String country, String switchType) {
		this.company = company;
		this.country = country;
		this.switchType = switchType;
	}
	
	public boolean get(Technika t, Kabel k) {
		if(t.getSwitchType().equals(k.getSwitchType1())) return true;
		if(t.getSwitchType().equals(k.getSwitchType2())) return true;
		return false;
	}

	protected abstract String getSwitchType();

}
