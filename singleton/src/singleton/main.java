package singleton;

public class main {

	public static void main(String[] args) {
		  System.out.println("--- Singleton Pattern ---");
	        sinhvien single1 = sinhvien.getInstance();
	        sinhvien single2 = sinhvien.getInstance();
	        single1.xuatsinhvien("sinhvien");
	        single2.xuatsinhvien("sinhvien2");
        if (single1.equals(single2)) {
	            System.out.println("Unique Instance");
        }
	}
}
