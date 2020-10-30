
public class GoldCard extends Card {

	public GoldCard(double startTurnover, Client client) {
		super(startTurnover, client);
	}

	@Override
	public double getDiscountRate() {
		return Math.min(10, 2 + (int) (turnover / 100));
	}
}