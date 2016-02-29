package game.fields;

public class CoinField extends AvailableField {

	protected boolean used = false;
	
	@Override
	protected String getSymbol() {
		if (used) return " ";
		return "$";
	}

	@Override
	public void onEnter() {
		this.used = true;
	}

}
