package game.fields;

public abstract class UnavailableField extends Field {

	@Override
	public boolean isAvailable() {
		return false;
	}
	
	@Override
	public void onEnter() {
		throw new RuntimeException();
	}

}