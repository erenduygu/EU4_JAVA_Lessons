package day13_Methods_Part1;


public class Task70_displayHighScorePosition {

	public static void main(String[] args) {
		
		int pos=calculateHighScorePosition(50);
		
		displayHighScorePosition("Mike",pos );//displayHighScorePosition("Mike",calculateHighScorePosition(50) ); is possible
		
		
	}

	public static void displayHighScorePosition(String playerName, int position) {

		System.out.println(playerName + " managed to get into position " + position + " on the high score table");
	
	
	}public static int calculateHighScorePosition(int thePlayerScore) {
		
		int positionValue=0;
		if (thePlayerScore>=1000) {positionValue=1;}//return 1;
		else if (thePlayerScore>=500&&thePlayerScore<1000) {positionValue=2;}// return 2;
		else if (thePlayerScore>=100&&thePlayerScore<500) {positionValue=3;} //return 3;
		else {positionValue=4;}// return 4;
	
		
		return positionValue;
	}
}
