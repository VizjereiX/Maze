package game.boardbuilders;

import game.Board;
import game.fields.EmptyField;

public class EmptyBuilder implements BoardBuilderInterface {

	@Override
	public void build(Board board) {
		for (int i = 0; i < board.getSize(); i++) {
			for (int j = 0; j < board.getSize(); j++) {
				board.setField(i, j,new EmptyField());
			}
		}
	}
}
