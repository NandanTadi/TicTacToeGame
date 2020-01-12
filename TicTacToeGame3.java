import java.util.Scanner;

public class TicTacToeGame3{

	public static void main(String[] args){

		Scanner tic = new Scanner(System.in);
		TicTacToeBoard board = new TicTacToeBoard(620,720);
// This in array is drawing up the board lines. In (xstart, ystart, xend, yend) format
		int[][]boardLine = {{0,200,600,200},
							 {0,400,600,400},
							 {200,0,200,600},
							 {400,0,400,600}};

		char [][]arr = new char[3][3];

				board.defineBoard(boardLine);
				board.setFiles("Image1.jpg","Image2.jpg");
				board.setBoard(arr);
				board.repaint();

		System.out.println("Welcome To The Online Tic - Tac - Toe Game! -> Developed by Nandan!");
		System.out.println("Place X or O in a box from 1-9 using yor keypad. The goal of the game is to get 3 of the same symbols in the same row, colum, or digonally. Have fun! ");
		System.out.println("How Many Players...Player[1] - Player[2]: ");
		int players = tic.nextInt();


		int location = 0;
		int locationC = 0;
		int win1 = 9;
		int counter = 0;
		int player = 0;
		int player2 = 0;
		int till = 9;
if(players == 2){

 		System.out.println("NOTE: Both players must imput a box for your move and then the symbols may appear.");
	board.repaint();
	for(int loop = 0; loop < till; loop++){
		System.out.print("Please choose a spot on the board (Player 1 // Symbol X) (1-9): ");
		player = tic.nextInt();

		System.out.print("Please choose a spot on the board (Player 2 // Symbol O) (1-9): ");
		player2 = tic.nextInt();

		if (player>=10){
			System.out.print("Error: You have entered a variable out of the box!");
			}
		switch(player){
			 case 1:
			 			if(arr[0][0]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[0][0]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[0][0]='x';
							board.repaint();
							board.delay(1000);
							System.out.println("Great Move!");}
			 	break;
			 case 2:
			 			if(arr[0][1]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[0][1]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[0][1]='x';
							board.repaint();
							board.delay(1000);
							System.out.println("Great Move!");}
			 	break;
			 case 3:
			 			if(arr[0][2]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[0][2]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[0][2]='x';
							board.repaint();
							board.delay(1000);
							System.out.println("Great Move!");}
			 	break;
			 case 4:
			 			if(arr[1][0]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[1][0]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[1][0]='x';
							board.repaint();
							board.delay(1000);
							System.out.println("Great Move!");}
			 	break;
			 case 5:
			 			if(arr[1][1]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[1][1]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[1][1]='x';
							board.repaint();
							board.delay(1000);
							System.out.println("Great Move!");}
			 	break;
			 case 6:
			 			if(arr[1][2]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[1][2]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[1][2]='x';
							board.repaint();
							board.delay(1000);
							System.out.println("Great Move!");}
			 	break;
			 case 7:
			 			if(arr[2][0]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[2][0]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[2][0]='x';
							board.repaint();
							board.delay(1000);
							System.out.println("Great Move!");}
			 	break;
			 case 8:
			 			if(arr[2][1]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[2][1]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[2][1]='x';
							board.repaint();
							board.delay(1000);
							System.out.println("Great Move!");}
			 	break;
			 case 9:
			 			if(arr[2][2]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[2][2]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[2][2]='x';
							board.repaint();
							board.delay(1000);
							System.out.println("Great Move!");}
			 	break;
}
switch(player2){
			 case 1:
			 			if(arr[0][0]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[0][0]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[0][0]='o';
							board.repaint();
							System.out.println("Great Move!");}
			 	break;
			 case 2:
			 			if(arr[0][1]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[0][1]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[0][1]='o';
							board.repaint();
							System.out.println("Great Move!");}
			 	break;
			 case 3:
			 			if(arr[0][2]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[0][2]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[0][2]='o';
							board.repaint();
							System.out.println("Great Move!");}
			 	break;
			 case 4:
			 			if(arr[1][0]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[1][0]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[1][0]='o';
							board.repaint();
							System.out.println("Great Move!");}
			 	break;
			 case 5:
			 			if(arr[1][1]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[1][1]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[1][1]='o';
							board.repaint();
							System.out.println("Great Move!");}
			 	break;
			 case 6:
			 			if(arr[1][2]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[1][2]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[1][2]='o';
							board.repaint();
							System.out.println("Great Move!");}
			 	break;
			 case 7:
			 			if(arr[2][0]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[2][0]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[2][0]='o';
							board.repaint();
							System.out.println("Great Move!");}
			 	break;
			 case 8:
			 			if(arr[2][1]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[2][1]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[2][1]='o';
							board.repaint();
							System.out.println("Great Move!");}
			 	break;
			 case 9:
			 			if(arr[2][2]=='x'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else if(arr[2][2]=='o'){
							System.out.println("Spot already taken!choose again!");
							till++;}
						else{
							arr[2][2]='o';
							board.repaint();
							System.out.println("Great Move!");}
			 	break;
}
boolean dab = true;
if(dab == true){
	 	if(arr[0][0]=='x' && arr[1][0] == arr[0][0] && arr[0][0] == arr[2][0]){
till = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;
}
		if(arr[0][1]=='x' && arr[1][1] == arr[0][1] && arr[0][1] == arr[2][1]){
till = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][2]=='x' && arr[1][2] == arr[0][2] && arr[0][2] == arr[2][2]){
till = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][0]=='x' && arr[0][1] == arr[0][0] && arr[0][0] == arr[0][2]){
till = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[1][0]=='x' && arr[1][1] == arr[1][0] && arr[1][0] == arr[1][2]){
till = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[2][0]=='x' && arr[2][1] == arr[2][0] && arr[2][0] == arr[2][2]){
till = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][0]=='x' && arr[1][1] == arr[0][0] && arr[0][0] == arr[2][2]){
till = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][2]=='x' && arr[1][1] == arr[0][2] && arr[0][2] == arr[2][0]){
till = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][0]=='o' && arr[1][0] == arr[0][0] && arr[0][0] == arr[2][0]){
till = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][1]=='o' && arr[1][1] == arr[0][1] && arr[0][1] == arr[2][1]){
till = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][2]=='o' && arr[1][2] == arr[0][2] && arr[0][2] == arr[2][2]){
till = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][0]=='o' && arr[0][1] == arr[0][0] && arr[0][0] == arr[0][2]){
till = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[1][0]=='o' && arr[1][1] == arr[1][0] && arr[1][0] == arr[1][2]){
till = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[2][0]=='o' && arr[2][1] == arr[2][0] && arr[2][0] == arr[2][2]){
till = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][0]=='o' && arr[1][1] == arr[0][0] && arr[0][0] == arr[2][2]){
till = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}
		if(arr[0][2]=='o' && arr[1][1] == arr[0][2] && arr[0][2] == arr[2][0]){
till = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
						dab = false;

}}
if(dab == true){
		if((arr[0][0]=='x' || arr[0][0]=='o') && (arr[0][1]=='x' || arr[0][1]=='o')  && (arr[0][2]=='x' || arr[0][2]=='o')  && (arr[1][0]=='x' || arr[1][0]=='o') && (arr[1][1]=='x' || arr[1][1]=='o')  && (arr[1][2]=='x' || arr[1][2]=='o')  && (arr[2][0]=='x' || arr[2][0]=='o') && (arr[2][1]=='x' || arr[2][1]=='o')  && (arr[2][2]=='x' || arr[2][2]=='o')){
till = 0;
System.out.print("TIE!");
board.setWinner(("It's a tie!"),  150, 650, 30);
board.showText(true);}
}
}
}
boolean turn1 = false;
boolean turn2 = false;
int locationrep = 0;
	if(turn1 == true){
	System.out.print("Please choose a spot on the board (1-9): ");
	location = tic.nextInt();}

	if(turn2 == true){
	System.out.print("Computer shall go now!");
	locationC = (int)(Math.random()*8)+1;}

if(players == 1){

 turn1 = true;
 turn2 = true;

for(int win = 0; win < win1; win++){
	if(turn1 == true){
	System.out.print("Please choose a spot on the board (1-9): ");
	location = tic.nextInt();}

	if(turn2 == true){
	System.out.print("Computer shall go now!");
	locationC = (int)(Math.random()*8)+1;}

switch(location){
	 case 1:
	 			if(arr[0][0]=='x'){
					System.out.println("Spot already taken!choose again!");
					System.out.print("Please choose a spot on the board (1-9): ");
					locationrep = tic.nextInt();}

				else if(arr[0][0]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[0][0]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 2:
	 			if(arr[0][1]=='x'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else if(arr[0][1]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[0][1]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 3:
	 			if(arr[0][2]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[0][2]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[0][2]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 4:
	 			if(arr[1][0]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[1][0]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[1][0]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 5:
	 			if(arr[1][1]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[1][1]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[1][1]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 6:
	 			if(arr[1][2]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[1][2]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[1][2]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 7:
	 			if(arr[2][0]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[2][0]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[2][0]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 8:
	 			if(arr[2][1]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[2][1]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[2][1]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 9:
	 			if(arr[2][2]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[2][2]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[2][2]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;

}
switch(locationrep){
	 case 1:
	 			if(arr[0][0]=='x'){
					System.out.println("Spot already taken!choose again!");
					System.out.print("Please choose a spot on the board (1-9): ");
					locationrep = tic.nextInt();}

				else if(arr[0][0]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[0][0]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 2:
	 			if(arr[0][1]=='x'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else if(arr[0][1]=='o'){
					System.out.println("Spot already taken!choose again!");
					turn1 = true;}
				else{
					arr[0][1]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 3:
	 			if(arr[0][2]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[0][2]=='o'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else{
					arr[0][2]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 4:
	 			if(arr[1][0]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[1][0]=='o'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else{
					arr[1][0]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 5:
	 			if(arr[1][1]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[1][1]=='o'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else{
					arr[1][1]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 6:
	 			if(arr[1][2]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[1][2]=='o'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else{
					arr[1][2]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 7:
	 			if(arr[2][0]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[2][0]=='o'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else{
					arr[2][0]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 8:
	 			if(arr[2][1]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[2][1]=='o'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else{
					arr[2][1]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 9:
	 			if(arr[2][2]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[2][2]=='o'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else{
					arr[2][2]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;

}
switch(locationC){
	 case 1:
	 			if(arr[0][0]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[0][0]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[0][0]='o';
					board.repaint();
					}
	 	break;
	 case 2:
	 			if(arr[0][1]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[0][1]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[0][1]='o';
					board.repaint();
					}
	 	break;
	 case 3:
	 			if(arr[0][2]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[0][2]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[0][2]='o';
					board.repaint();
					}
	 	break;
	 case 4:
	 			if(arr[1][0]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[1][0]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[1][0]='o';
					board.repaint();
					}
	 	break;
	 case 5:
	 			if(arr[1][1]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[1][1]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[1][1]='o';
					board.repaint();
					}
	 	break;
	 case 6:
	 			if(arr[1][2]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[1][2]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[1][2]='o';
					board.repaint();
					}
	 	break;
	 case 7:
	 			if(arr[2][0]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[2][0]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[2][0]='o';
					board.repaint();
					}
	 	break;
	 case 8:
	 			if(arr[2][1]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[2][1]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[2][1]='o';
					board.repaint();
					}
	 	break;
	 case 9:
	 			if(arr[2][2]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[2][2]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[2][2]='o';
					board.repaint();
					}
	 	break;
	 }
switch(locationC){
	 case 1:
	 			if(arr[0][0]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[0][0]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[0][0]='o';
					board.repaint();
					}
	 	break;
	 case 2:
	 			if(arr[0][1]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[0][1]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[0][1]='o';
					board.repaint();
					}
	 	break;
	 case 3:
	 			if(arr[0][2]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[0][2]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[0][2]='o';
					board.repaint();
					}
	 	break;
	 case 4:
	 			if(arr[1][0]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[1][0]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[1][0]='o';
					board.repaint();
					}
	 	break;
	 case 5:
	 			if(arr[1][1]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[1][1]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[1][1]='o';
					board.repaint();
					}
	 	break;
	 case 6:
	 			if(arr[1][2]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[1][2]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[1][2]='o';
					board.repaint();
					}
	 	break;
	 case 7:
	 			if(arr[2][0]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[2][0]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[2][0]='o';
					board.repaint();
					}
	 	break;
	 case 8:
	 			if(arr[2][1]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[2][1]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[2][1]='o';
					board.repaint();
					}
	 	break;
	 case 9:
	 			if(arr[2][2]=='x'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else if(arr[2][2]=='o'){
			 locationC = (int)(Math.random()*8)+1;
					}
				else{
					arr[2][2]='o';
					board.repaint();
					}
	 	break;

}
//WINNING CHECK MAKE FOR EVERY POSSIBILITY!
	 	if(arr[0][0]=='x' && arr[1][0] == arr[0][0] && arr[0][0] == arr[2][0]){
win1 = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][1]=='x' && arr[1][1] == arr[0][1] && arr[0][1] == arr[2][1]){
win1 = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][2]=='x' && arr[1][2] == arr[0][2] && arr[0][2] == arr[2][2]){
win1 = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][0]=='x' && arr[0][1] == arr[0][0] && arr[0][0] == arr[0][2]){
win1 = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[1][0]=='x' && arr[1][1] == arr[1][0] && arr[1][0] == arr[1][2]){
win1 = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[2][0]=='x' && arr[2][1] == arr[2][0] && arr[2][0] == arr[2][2]){
win1 = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][0]=='x' && arr[1][1] == arr[0][0] && arr[0][0] == arr[2][2]){
win1 = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][2]=='x' && arr[1][1] == arr[0][2] && arr[0][2] == arr[2][0]){
win1 = 0;
System.out.print("X WINS!");
board.setWinner(("X WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][0]=='o' && arr[1][0] == arr[0][0] && arr[0][0] == arr[2][0]){
win1 = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][1]=='o' && arr[1][1] == arr[0][1] && arr[0][1] == arr[2][1]){
win1 = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][2]=='o' && arr[1][2] == arr[0][2] && arr[0][2] == arr[2][2]){
win1 = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][0]=='o' && arr[0][1] == arr[0][0] && arr[0][0] == arr[0][2]){
win1 = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[1][0]=='o' && arr[1][1] == arr[1][0] && arr[1][0] == arr[1][2]){
win1 = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[2][0]=='o' && arr[2][1] == arr[2][0] && arr[2][0] == arr[2][2]){
win1 = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][0]=='o' && arr[1][1] == arr[0][0] && arr[0][0] == arr[2][2]){
win1 = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
}
		if(arr[0][2]=='o' && arr[1][1] == arr[0][2] && arr[0][2] == arr[2][0]){
win1 = 0;
System.out.print("O WINS!");
board.setWinner(("O WINS!"),  150, 650, 30);
			board.showText(true);
}
		if((arr[0][0]=='x' || arr[0][0]=='o') && (arr[0][1]=='x' || arr[0][1]=='o')  && (arr[0][2]=='x' || arr[0][2]=='o')  && (arr[1][0]=='x' || arr[1][0]=='o') && (arr[1][1]=='x' || arr[1][1]=='o')  && (arr[1][2]=='x' || arr[1][2]=='o')  && (arr[2][0]=='x' || arr[2][0]=='o') && (arr[2][1]=='x' || arr[2][1]=='o')  && (arr[2][2]=='x' || arr[2][2]=='o')){
win1 = 0;
System.out.print("TIE!");
board.setWinner(("It's a tie!"),  150, 650, 30);
board.showText(true);
	}
  }}
}}
