package nullobject;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitMoneyCountry unitMC = CountryFactory.getUnitMoneyCountry("Vietnam");
		System.out.println(unitMC.getCountry() + ": " + unitMC.unitMoney());
		
		//null country
		UnitMoneyCountry unitMC1 = CountryFactory.getUnitMoneyCountry("ABC");
		System.out.println(unitMC1.getCountry() + ": " + unitMC1.unitMoney());
	}

}
