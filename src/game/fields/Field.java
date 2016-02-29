package game.fields;

public abstract class Field {
	public abstract boolean isAvailable();
	
	public void draw(){
		System.out.print(this.getSymbol());
	}

	protected abstract String getSymbol();
	
	public abstract void onEnter();
}
