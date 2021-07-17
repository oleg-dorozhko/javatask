public class Powerbank extends Technika {
	public Powerbank(String company, String country, String switchType) {
		super(company,country,switchType);
	}

	@Override
	protected String getSwitchType() {

		return this.switchType;
	}

}
