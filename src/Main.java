import java.util.Date;
import java.util.Scanner;

import game.Game;
import game.boardbuilders.RandomBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj n: ");
		Game game = new Game(in.nextInt());
		game.init(new RandomBuilder(new Date().getTime()));
		game.draw();
	}

}
