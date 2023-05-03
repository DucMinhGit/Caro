package code;

import java.util.Scanner;

class Game {
	
	Board board = new Board();
	Player player1 = new Player("X");
	Player player2 = new Player("O");
	
	Player currentPlayer = player1;
	
	void play() {
		
		String message;
		
		while(true) {
			message = "Enter the position (1 - 9): ";
			System.out.println(currentPlayer.name + " " + message);
			Scanner input = new Scanner(System.in);
			
			int position = input.nextInt();
			
			if(board.updateBoard(position, currentPlayer.type)) 
			{
				board.printBoard();
				
			if(board.checkWinner(currentPlayer.type)) {
				System.out.println(currentPlayer.name + "Wins!");
				break;
			} else if(board.checkDraw()) {
				 System.out.println("Game is a draw!");
                 break;
			} else {				
				if(currentPlayer == player1) {
					currentPlayer = player2;
				} else {
					currentPlayer = player1;
				}
			}
			}
		}
	}
}
