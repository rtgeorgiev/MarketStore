
public class SilverCard extends Card {

	public SilverCard(double startTurnover, Client client) {
		super(startTurnover, client);
	}

	@Override
	public double getDiscountRate() {
		if (this.turnover > 300) {
			return 3.5;
		}
		return 2;
	}
}