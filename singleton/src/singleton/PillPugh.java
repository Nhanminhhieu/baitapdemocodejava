package singleton;

public class PillPugh {
	private PillPugh() {
		
	}
	public static PillPugh getInstance() {
		return singletonHelper.instance;
	}
	
	public static class singletonHelper {
		private static final PillPugh instance =  new PillPugh();
	}
}
