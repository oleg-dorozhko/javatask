public class Notebook extends Technika {
	public Notebook(String company, String country, String switchType) {
		super(company,country,switchType);
	}

	@Override
	protected String getSwitchType() {
		return this.switchType;
	}

}
