package game.boardbuilders;

import java.util.Random;

import game.Board;
import game.fields.EmptyField;
import game.fields.Field;
import game.fields.FinishField;
import game.fields.RockField;
import game.fields.StartField;
import game.fields.WallField;

public class RandomBuilder extends BoardWithBordersBuilder {
	private static final int MAX_FINISH_FIELDS = 3;
	private static final int MAX_ROCK_FIELDS = 10;
	Random random;

	public RandomBuilder(long seed) {
		random = new Random(seed);
	}

	@Override
	public void build(Board board) {
		super.build(board);
		setFieldAtRandomBorderPosition(board, new StartField());
		for (int i = 1; i < random.nextInt(MAX_FINISH_FIELDS) + 1; i++)
			setFieldAtRandomBorderPosition(board, new FinishField());
		for (int i = 0; i < random.nextInt(MAX_ROCK_FIELDS); i++) {
			setFieldAtRandomPosition(board, new RockField());
		}
	}

	private void setFieldAtRandomBorderPosition(Board board, Field field) {
		int x = 0, y = 0;
		do {
			int wallNum = random.nextInt(4);
			switch (wallNum) {
			case 0:
				x = random.nextInt(board.getSize() -2) + 1;
				y = 0;
				break;
			case 1:
				y = random.nextInt(board.getSize() - 2) + 1;
				x = board.getSize() - 1;
				break;
			case 2:
				x = random.nextInt(board.getSize() - 2) + 1;
				y = board.getSize() - 1;
				;
				break;
			case 3:
				y = random.nextInt(board.getSize() - 2) + 1;
				x = 0;
				break;
			}
		} while (board.getField(x, y).getClass() != WallField.class);
		board.setField(x, y, field);
	}

	private void setFieldAtRandomPosition(Board board, Field field) {
		int x = 0, y = 0;
		do {
			x = random.nextInt(board.getSize() - 2) + 1;
			y = random.nextInt(board.getSize() - 2) + 1;
				
		} while (board.getField(x, y).getClass() != EmptyField.class);
		board.setField(x, y, field);
	}
}
