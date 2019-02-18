package nullobject;

public class RealCountry implements UnitMoneyCountry{

	private String country;
	private String unit;
	
	public RealCountry(String country, String unit) {
		super();
		this.country = country;
		this.unit = unit;
	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return country;
	}

	@Override
	public String unitMoney() {
		// TODO Auto-generated method stub
		return unit;
	}

}
