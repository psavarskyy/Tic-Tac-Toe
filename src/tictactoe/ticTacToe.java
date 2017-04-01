package tictactoe;

import java.util.Scanner;


public class ticTacToe {

	public static void main (String[] args)
	{
	//creates the board
	ticTacToeBoard board = new ticTacToeBoard();
	
	//asks user if they want to play against the ai or another user
	Scanner scan = new Scanner(System.in);
	System.out.println ("Do you want to play against the computer or against another person? (c/p)");
	String answer = scan.next();
	
	
	
	if (answer.equals("c"))
		{
		computerAI compAi = new computerAI();
		
		board.userOneMove();
		board.randomMove();
		board.printBoard();
		//runs until game is over or their is a winner
		while (1 > 0)
			{
			//user takes turn
			board.userOneMove();	
			board.winTest();
			board.boardFullTest();
			
			int open = compAi.computerMove();
			if (open == 0)
				board.randomMove();
				
			board.printBoard();
			board.winTest();
			//tests to see if the board is full
			board.boardFullTest();
			}
		}
		
	if (answer.equals("p"))
	{
	//runs until game is over or their is a winner
	while (1 > 0)
		{
		//user one takes turn
		board.userOneMove();
		board.printBoard();
		//tests if there is a winner or if the board is full
		board.winTest();
		board.boardFullTest();
	
		//user two takes turn
		board.userTwoMove();
		board.printBoard();
		board.winTest();
		
		//tests to see if the board is full
		board.boardFullTest();
		}
		}
	}
}
