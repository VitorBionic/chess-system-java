package application;
import boardgame.Position;
import boardgame.Board;

public class Program {

	public static void main(String[] args) {
		
		Position pos = new Position(2, 3);
		Board board = new Board(8, 8);
		
		System.out.println(pos);
		
	}
}
