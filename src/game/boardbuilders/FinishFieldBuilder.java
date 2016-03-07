package game.boardbuilders;

import game.Board;
import game.fields.FinishField;

public class FinishFieldBuilder implements BoardBuilderInterface {

	protected int x;
	protected int y;

	public FinishFieldBuilder(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void build(Board board) {
		board.setField(x, y, new FinishField());
	}

}
