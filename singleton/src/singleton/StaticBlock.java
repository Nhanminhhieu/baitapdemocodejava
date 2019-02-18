package singleton;

public class StaticBlock {
	private static final StaticBlock instance;
	private StaticBlock() {
		
	}
	static {
		try {
			instance = new StaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("Loi khoi tao instance");
		}
	}
	public static StaticBlock getInstance() {
		return instance;
	}
}
