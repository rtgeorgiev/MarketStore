
public abstract class Card {

	private Client client;
	protected double turnover;

	public Card(double startTurnover, Client client) {
		this.client = client;
		this.turnover = startTurnover;
	}

	abstract public double getDiscountRate();

	final public double getDiscount(double amount) {
		return amount * getDiscountRate() / 100;
	}

	final public double getTurnover() {
		return turnover;
	}

	final public void increaseTurnover(double amount) {
		this.turnover += amount;
	}
}
