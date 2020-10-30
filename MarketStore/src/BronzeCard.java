
public class BronzeCard extends Card {

	public BronzeCard(double startTurnover, Client client) {
		super(startTurnover, client);
	}

	@Override
	public double getDiscountRate() {
		if (this.turnover < 100) {
			return 0.0;
		} else if (this.turnover >= 100 && this.turnover <= 300) {
			return 1.0;
		} else {
			return 2.5;
		}
	}
}
