package nullobject;

import java.util.HashMap;
import java.util.Map;

public class CountryFactory {
	public static final Map<String,String> unitMoney = new HashMap<>();
	static {
		unitMoney.put("Vietnam","VND");
		unitMoney.put("USA","USD");
		unitMoney.put("Anh","Bang Anh");
	}
	public static UnitMoneyCountry getUnitMoneyCountry(String country) {
		if(unitMoney.get(country)!= null)		//nếu tên nước không có trong map, thì trả về class null object
			return new RealCountry(country, unitMoney.get(country));
		return new NullCountry(country);
	}
}
