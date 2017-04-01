package tictactoe;

import java.util.Scanner;


public class ticTacToeBoard {

	//creates tic tac toe board 
	static int [][] playingBoard = {	{0,0,0}, {0,0,0}, {0,0,0}	};
	
	
	public void printBoard()
	{
	for (int row = 0; playingBoard.length > row; row ++)  {
		for (int column = 0; playingBoard[row].length > column; column ++)
		{	System.out.print (playingBoard[row][column] + "   ");}
		System.out.println(); }
	}
	
	
	public static void userOneMove()
	{
	Scanner scan = new Scanner(System.in);
	
	//asks userOne for a move
	System.out.println ("What is your move user 1? (row column)");
	int row = scan.nextInt();
	int column = scan.nextInt();
	
	//tests to see if the move is ok
	if ( playingBoard[row - 1][column - 1] == 0)
		{
		playingBoard[row - 1][column - 1] = 1;
		}
	else
		{
		System.out.println ("Thats not a valid move.");
		ticTacToeBoard.userOneMove();
		}
	}

	
	
	public static void userTwoMove()
	{
	Scanner scan = new Scanner(System.in);
	
	//asks userTwo for a move
	System.out.println ("What is your move user 2? (row column)");
	int row = scan.nextInt();
	int column = scan.nextInt();
	
	//tests to see if the move is ok
	if ( playingBoard[row - 1][column - 1] == 0)
		{
		playingBoard[row - 1][column - 1] = 2;
		}
	else
		{
		System.out.println ("Thats not a valid move.");
		ticTacToeBoard.userTwoMove();
		}
	}
	
	
	
	//runs a random move 
	public void randomMove ()
	{
		//random number generator and boolean
		int row = (int) (Math.random()*3 - 1);
		int column = (int) (Math.random()*3 - 1);
		boolean validMove = false;
		
		//tests to see of move is valid and if not runs again
		while (validMove != true)
		{
			if ( playingBoard[row][column] == 0)
				{
				playingBoard[row][column] = 2;
				validMove = true;
				}
			else 
			{
				row = (int) (Math.random()*3);
				column = (int) (Math.random()*3);
				validMove = false;
			}
		}
		
	}
	
	
	public void winTest()
	{
		//tests to see if their is a winner
		//returns true if their is a winner
		
		//tests the top row
		if (playingBoard[0][0] == 1 && playingBoard[0][1] == 1 && playingBoard[0][2] == 1 )
			{
			System.out.println("User one won!");
			System.exit(1);
			}
		if (playingBoard[0][0] == 2 && playingBoard[0][1] == 2 && playingBoard[0][2] == 2 )
			{
			System.out.println("User two (or the computer) won!");
			System.exit(1);
			}
		
		//tests the middle row
		if (playingBoard[1][0] == 1 && playingBoard[1][1] == 1 && playingBoard[1][2] == 1 )
			{
			System.out.println("User one won!");
			System.exit(1);
			}
		if (playingBoard[1][0] == 2 && playingBoard[1][1] == 2 && playingBoard[1][2] == 2 )
			{
			System.out.println("User two (or the computer) won!");
			System.exit(1);
			}
		
		//tests the bottom row
		if (playingBoard[2][0] == 1 && playingBoard[2][1] == 1 && playingBoard[2][2] == 1 )
			{
			System.out.println("User one won!");
			System.exit(1);
			}
		if (playingBoard[2][0] == 2 && playingBoard[2][1] == 2 && playingBoard[2][2] == 2 )
			{
			System.out.println("User two (or the computer) won!");
			System.exit(1);
			}
		
		//tests the left column
		if (playingBoard[0][0] == 1 && playingBoard[1][0] == 1 && playingBoard[2][0] == 1 )
			{
			System.out.println("User one won!");
			System.exit(1);
			}
		if (playingBoard[0][0] == 2 && playingBoard[1][0] == 2 && playingBoard[2][0] == 2 )
			{
			System.out.println("User two (or the computer) won!");
			System.exit(1);
			}
		
		//tests the middle column
		if (playingBoard[0][1] == 1 && playingBoard[1][1] == 1 && playingBoard[2][1] == 1 )
			{
			System.out.println("User one won!");
			System.exit(1);
			}
		if (playingBoard[0][1] == 2 && playingBoard[1][1] == 2 && playingBoard[2][1] == 2 )
			{
			System.out.println("User two (or the computer) won!");
			System.exit(1);
			}
		
		//tests the right column
		if (playingBoard[0][2] == 1 && playingBoard[1][2] == 1 && playingBoard[2][2] == 1 )
			{
			System.out.println("User one won!");
			System.exit(1);
			}
		if (playingBoard[0][2] == 2 && playingBoard[1][2] == 2 && playingBoard[2][2] == 2 )
			{
			System.out.println("User two (or the computer) won!");
			System.exit(1);
			}
		
		//tests the left diagonal
		if (playingBoard[0][0] == 1 && playingBoard[1][1] == 1 && playingBoard[2][2] == 1 )
			{
			System.out.println("User one won!");
			System.exit(1);
			}
		if (playingBoard[0][0] == 2 && playingBoard[1][1] == 2 && playingBoard[2][2] == 2 )
			{
			System.out.println("User two (or the computer) won!");
			System.exit(1);
			}
		
		//tests the right diagonal
		if (playingBoard[0][2] == 1 && playingBoard[1][1] == 1 && playingBoard[2][0] == 1 )
			{
			System.out.println("User one won!");
			System.exit(1);
			}
		if (playingBoard[0][2] == 2 && playingBoard[1][1] == 2 && playingBoard[2][0] == 2 )
			{
			System.out.println("User two (or the computer) won!");
			System.exit(1);
			}
		
	}
	
	
	public void boardFullTest()
	{
		//tests to see if the board is full, the lowest combination of numbers of 1 and 2 is equal to 13, if the board is greater than or equal to 13 the program ends
		int total = 0;
		
		for (int row = 0; playingBoard.length > row; row ++)  
			for (int column = 0; playingBoard[row].length > column; column ++)
				total += playingBoard[row][column];
		if(total == 13)
		{
			System.out.println("The board the is full. Game over.");
			System.exit(1);
		}
	}
	
}
