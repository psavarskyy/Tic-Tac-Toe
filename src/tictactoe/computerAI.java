package tictactoe;

public class computerAI extends ticTacToeBoard  {
	
	private int spotOpen;
	
	public int computerMove()
	{
		//tests to see if the user got two spaces in a row, if they did, the AI will use its turn to stop the three in a row
		//tests the top row
		if (playingBoard[0][0] == 1 && playingBoard[0][1] == 1 && playingBoard[0][2] == 0)
			{playingBoard[0][2] = 2;
			 return spotOpen = 1;  
			}
		if (playingBoard[0][1] == 1 && playingBoard[0][2] == 1 && playingBoard[0][0] == 0)
			{playingBoard[0][0] = 2;
			return spotOpen = 1;  
			}
		
		if (playingBoard[0][0] == 1 && playingBoard[0][2] == 1 && playingBoard[0][1] == 0)
			{playingBoard[0][1] = 2;
			return spotOpen = 1; 
			}
					
		//tests the middle row
		if (playingBoard[1][0] == 1 && playingBoard[1][1] == 1 && playingBoard[1][2] == 0)
			{playingBoard[1][2] = 2;
			return spotOpen = 1;  
			}
		
		if (playingBoard[1][0] == 1 && playingBoard[1][2] == 1 && playingBoard[1][1] == 0)
			{playingBoard[1][1] = 2;
			return spotOpen = 1;  
			}
		
		if (playingBoard[1][2] == 1 && playingBoard[1][1] == 1 && playingBoard[1][0] == 0)
			{playingBoard[1][0] = 2;
			return spotOpen = 1; 
			}
		
		//tests the bottom row
		if (playingBoard[2][0] == 1 && playingBoard[2][1] == 1 && playingBoard[2][2] == 0)
			{playingBoard[2][2] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[2][1] == 1 && playingBoard[2][2] == 1 && playingBoard[2][0] == 0)
			{playingBoard[2][0] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[2][0] == 1 && playingBoard[2][2] == 1 && playingBoard[2][1] == 0)
			{playingBoard[2][1] = 2;
			return spotOpen = 1; 
			}
		
		//tests the left column
		if (playingBoard[0][0] == 1 && playingBoard[1][0] == 1 && playingBoard[2][0] == 0)
			{playingBoard[2][0] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[1][0] == 1 && playingBoard[2][0] == 1 && playingBoard[0][0] == 0)
			{playingBoard[0][0] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[0][0] == 1 && playingBoard[2][0] == 1 && playingBoard[1][0] == 0)
			{playingBoard[1][0] = 2;
			return spotOpen = 1; 
			}
		
		//tests the middle column
		if (playingBoard[0][1] == 1 && playingBoard[1][1] == 1 && playingBoard[2][1] == 0)
			{playingBoard[2][1] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[1][1] == 1 && playingBoard[2][1] == 1 && playingBoard[0][1] == 0)
			{playingBoard[0][1] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[0][1] == 1 && playingBoard[2][1] == 1 && playingBoard[1][1] == 0)
			{playingBoard[1][1] = 2;
			return spotOpen = 1; 
			}
		
		//tests the right column
		if (playingBoard[0][2] == 1 && playingBoard[1][2] == 1 && playingBoard[2][2] == 0)
			{playingBoard[2][2] = 2; 
			return spotOpen = 1; 
			}
		
		if (playingBoard[1][2] == 1 && playingBoard[2][2] == 1 && playingBoard[0][2] == 0)
			{playingBoard[0][2] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[0][2] == 1 && playingBoard[2][2] == 1 && playingBoard[1][2] == 0)
			{playingBoard[1][2] = 2;
			return spotOpen = 1; 
			}
		
		//tests the left diagonal
		if (playingBoard[0][0] == 1 && playingBoard[1][1] == 1 && playingBoard[2][2] == 0)
			{playingBoard[2][2] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[1][1] == 1 && playingBoard[2][2] == 1 && playingBoard[0][0] == 0)
			{playingBoard[0][0] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[0][0] == 1 && playingBoard[2][2] == 1 && playingBoard[1][1] == 0)
			{playingBoard[1][1] = 2;
			return spotOpen = 1; 
			}
		
		//tests the right diagonal
		if (playingBoard[0][2] == 1 && playingBoard[1][1] == 1 && playingBoard[2][0] == 0)
			{playingBoard[2][0] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[1][1] == 1 && playingBoard[2][0] == 1 && playingBoard[0][2] == 0)
			{playingBoard[0][2] = 2;
			return spotOpen = 1; 
			}
		
		if (playingBoard[0][2] == 1 && playingBoard[2][0] == 1 && playingBoard[1][1] == 0)
			{playingBoard[1][1] = 2;
			return spotOpen = 1; 
			}
		return spotOpen = 0;
	}
}
