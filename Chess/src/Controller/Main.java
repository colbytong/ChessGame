package Controller;

import java.awt.Point;

import ChessBoard.Board;

public class Main {

	public static void main(String[] args) {
		Board testBoard = new Board();
		testBoard.printBoard();
		testBoard.move(new Point(7,2), new Point(5,4));
		System.out.println();
		System.out.println();
		System.out.println();
		testBoard.printBoard();
		System.out.println("Just testing out if my commits are working");
		System.out.println("Testing if the pull works");

	}

}
