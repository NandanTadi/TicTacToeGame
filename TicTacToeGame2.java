import java.util.Scanner;

public class TicTacToeGame2{
	public static void main(String[]args){

		Scanner tic = new Scanner(System.in);
		TicTacToeBoard board = new TicTacToeBoard(620,720);

		int[][]boardLine = 	 {{0,200,600,200},
							 {0,400,600,400},
							 {200,0,200,600},
							 {400,0,400,600}};

		char [][]arr = new char[3][3];
			for (int i=0;i<3;i++)
				for (int j=0;j<3;j++)
					arr[i][j]='-';

		int one = arr[0][0]='-';
		int two = arr[0][1]='-';
		int three = arr[0][2]='-';
		int four = arr[1][0]='-';
		int five = arr[1][1]='-';
		int six = arr[1][2]='-';
		int seven = arr[2][0]='-';
		int eight = arr[2][1]='-';
		int nine = arr[2][2]='-';

		boolean gameend = false;
		boolean playersTurn =false;
		String playericon = "";
		String playerSymbol = "";

		board.defineBoard(boardLine);
		board.setFiles("Image1.jpeg","Image2.jpeg");
		board.setBoard(arr);
		board.repaint();

//INTRO - DIRECTIONS:
		System.out.println("Welcome To The Local Tic - Tac - Toe Game! -> Developed by Nandan!");
		System.out.println("How to Play:\n1) When Its your turn you can start off by selecting a box from 1 - 9.\n2) The goal of the came is to get 3 of the same in a row.\n3) You may win by 3 in a diagnol, row, or even a colum!\n4) Start the game on by choosing the amount of players! Enjoy!");
//PLAYER X OR O CHOICE
		String option = "";
        while(!option.equalsIgnoreCase("Z") && !option.equalsIgnoreCase("A"))
        {
            System.out.print("Choose your symbol (Z or A): ");
            option = tic.next();
            if(!option.equalsIgnoreCase("Z") && !option.equalsIgnoreCase("A"))
            {
                System.out.println("Invalid input, please try again!");
            }}

         if(option.equalsIgnoreCase("Z"))
        {
            playersTurn = true;
        }
        playerSymbol = option.toUpperCase();
//AMOUNT OF PLAYERS
		System.out.println("How Many Players...Player[0]  Player[1]  Player[2]");
		int players = tic.nextInt();
//GAME START
		while(gameend == false){
			 if(playersTurn) {
			 System.out.print("Please choose a spot on the board (1-9): ");
String pnumber = tic.nextLine();
gameend=true;
			 if(pnumber == "one"){
				 if(arr[0][0]=='x'){
				 	System.out.println("Spot already taken!");}
				 		else if(arr[0][0]=='o'){
	                		System.out.println("Spot already taken!");}
	                			else{
			                		arr[0][0]='x';
			                		board.repaint();
										System.out.println("Great Move!");
				gameend=false;

			                		}
			                		board.repaint();
	                	}
	                	board.repaint();
				 }



			}

		}



	}

