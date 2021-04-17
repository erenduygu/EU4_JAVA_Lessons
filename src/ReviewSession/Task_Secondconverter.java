package ReviewSession;

public class Task_Secondconverter {

	public static void main(String[] args) {

int second=8952;
int minutes, hours;

int secondsRemainingAfterhour;

hours=second/3600;
//calculate the mine for remaining
System.out.println(hours);


secondsRemainingAfterhour=second%3600;

		
		minutes=secondsRemainingAfterhour/60;
		
		System.out.println(minutes);

		int secondsRemainingAfterminutes=secondsRemainingAfterhour%60;

		System.out.println(secondsRemainingAfterminutes);

		
		
		
		
	}

}
