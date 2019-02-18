package singleton;

public class sinhvien {
	private static sinhvien instance;
	private sinhvien() {
	}
	public static sinhvien getInstance() {
		if(instance == null) {
			instance = new sinhvien();
		}
		return instance;
	}
	public void xuatsinhvien(String chuoi) {
		System.out.println(chuoi);
	}
}

