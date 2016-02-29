package game;

import java.util.ArrayList;

import game.fields.EmptyField;
import game.fields.Field;
import game.fields.WallField;

public class Game {
	protected int x;
	protected int y;
	protected Field[][] board;
	protected int n;
	
	public Game(int n) {
		this.n = n;
	}
	
	
	public void init (){
		board = new Field[n][n];
		initEmpty();
		addBorders();
	}

	private void addBorders() {
		for (int j = 0; j < n; j++) {
			board[0][j] = new WallField();
			board[n-1][j] = new WallField();
			board[j][0] = new WallField();
			board[j][n-1] = new WallField();
		}
		
	}

	private void initEmpty() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = new EmptyField();
			}
		}
	}
	
	public void draw() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j].draw();
			}
			System.out.println("");
		}
	}
	
}
