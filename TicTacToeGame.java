import java.util.Scanner;

public class TicTacToeGame{

	public static void main(String[] args){

		Scanner tic = new Scanner(System.in);
		TicTacToeBoard board = new TicTacToeBoard(620,720);
// This in array is drawing up the board lines. In (xstart, ystart, xend, yend) format
		int[][]boardLine = {{0,200,600,200},
							 {0,400,600,400},
							 {200,0,200,600},
							 {400,0,400,600}};

		char [][]arr = new char[3][3];


					int x1 =(int)(Math.random()*3)+0;
					int y1 =(int)(Math.random()*3)+0;

				board.defineBoard(boardLine);
				board.setFiles("Image1.jpeg","Image2.jpeg");
				board.setBoard(arr);
				board.repaint();

		System.out.println("Welcome To The Online Tic - Tac - Toe Game! -> Developed by Nandan!");
		System.out.println("How Many Players...Player[1] - Player[2]: ");
		int players = tic.nextInt();

		int location = 0;
		int locationC = 0;
		int win1 = 9;

		if(players == 1){
		for(int win = 0; win < win1; win++){
			 System.out.print("Computer shall go now!");
			 locationC = (int)(Math.random()*8)+1;

			 System.out.print("Please choose a spot on the board (1-9): ");
			 location = tic.nextInt();


switch(location){
	 case 1:
	 			if(arr[0][0]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[0][0]=='o'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else{
					arr[0][0]='x';
					board.repaint();
					System.out.println("Great Move!");}
	 	break;
	 case 2:
	 			if(arr[0][1]=='x'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
				else if(arr[0][1]=='o'){
					System.out.println("Spot already taken!choose again!");
					win1++;}
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
/*	if(CHECK FOR WIN){
}
		else if(CHECK FOR NO WINNER){
}
			else{
					gameEnd = false;
}

/* if(gameEnd = true){
		win1 = 0;
}*/

	 	}}
	}}
}
