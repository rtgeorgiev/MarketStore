
public class Main {

	public static void main(String[] args) {

		Card bronzeCard = new BronzeCard(0, new Client("Peter"));
		Card silverCard = new SilverCard(600, new Client("Georgi"));
		Card goldCard = new GoldCard(1500, new Client("Ivo"));

		PayDesk.processPayment(bronzeCard, 150);
		PayDesk.processPayment(silverCard, 850);
		PayDesk.processPayment(goldCard, 1500);
	}
}
