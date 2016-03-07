package game;
import game.boardbuilders.BoardBuilderInterface;

public class Game {
	protected int x;
	protected int y;
	protected Board board;
	protected int n;
	
	public Game(int n) {
		this.n = n;
	}
	
	
	public void init (BoardBuilderInterface bbi){
		board = new Board(this.n);
		bbi.build(board);
	}

	public void draw() {
		board.draw();
	}
}
