
public class Smartphone extends Technika {

	public Smartphone(String company, String country, String switchType) {
		super(company,country,switchType);
	}

	@Override
	protected String getSwitchType() {
		return this.switchType;
	}

}
