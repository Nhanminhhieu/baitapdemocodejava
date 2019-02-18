
public class Customer {
	private MarkettingStrategy markettingStrategy;
	public Customer(MarkettingStrategy markettingStrategy) {
		this.markettingStrategy = markettingStrategy;
	}
	public void salecustom() {
		markettingStrategy.sale();
	}
}
