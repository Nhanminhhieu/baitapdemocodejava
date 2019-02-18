package nullobject;

public class NullCountry implements UnitMoneyCountry{

	private String country;
	     
	public NullCountry(String country) {
		super();
		if(country != null) {
		this.country = country;
		}
	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return country;
	}

	@Override
	public String unitMoney() {
		// TODO Auto-generated method stub
		return "UNKNOWN MONEY";
	}
	
}
