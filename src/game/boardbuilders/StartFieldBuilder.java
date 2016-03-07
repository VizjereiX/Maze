package game.boardbuilders;

import game.Board;
import game.fields.StartField;

public class StartFieldBuilder implements BoardBuilderInterface {

	protected int x;
	protected int y;
	
	public StartFieldBuilder(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void build(Board board) {
		board.setField(x, y, new StartField());
	}

}
