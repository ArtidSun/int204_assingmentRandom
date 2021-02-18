package random.model;

public class DiceService implements RandomService {
	@Override
	public String getStringValue() {
		// random 1-6 and return as a string
		double diceface = Math.floor((Math.random() * 6) + 1);
		String dice = String.valueOf(diceface);
		return dice;
	}
}
