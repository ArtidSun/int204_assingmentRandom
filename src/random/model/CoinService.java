package random.model;

public class CoinService implements RandomService {
	
	double chanceOfHead;

	public CoinService() { }
	
	public CoinService(double chanceOfHead) {
		this.chanceOfHead = chanceOfHead;
	}
	
	public void setChance(double chance) { chanceOfHead = chance; }
	
	@Override
	public String getStringValue() {
		// random 0-1 and return as string "tail" or "head"
		double medal = Math.floor((Math.random() * 2));
		String coin = "";
		if(medal == 1) {
			coin = "head";
		}else if(medal == 0) {
			coin = "tail";
		}
		return coin;
	}

}
