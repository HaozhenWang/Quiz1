package QB;
import java.util.Scanner;
public class QBScore {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of Touchdowns!");
		double TD = input.nextDouble();
		System.out.println("Please enter the number of  Total Yards!");
		double YARDS = input.nextDouble();
		System.out.println("Please enter the number of Interceptions!");
		double INT = input.nextDouble();
		System.out.println("Please enter the number of Completions!");
		double COMP = input.nextDouble();
		System.out.println("Please enter the number of Pass Attempted!");
		double ATT = input.nextDouble();
		
		input.close();
		
		
		double a = (COMP/ATT- 0.3) * 5;
		double b = (YARDS/ATT-3) * 0.25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - (INT/ATT * 25);
		
		if (a > 2.375){
			a = 2.375;
		}
		else if (a < 0){
			a = 0;
		}
		if (b > 2.375){
			b = 2.375;
		}
		else if (b < 0){
			b = 0;
		}
		if (c > 2.375){
			c = 2.375;
		}
		else if (c < 0){
			c = 0;
		}
		if (d > 2.375){
			d = 2.375;
		}
		else if (d < 0){
			d = 0;
		}
				
		double QB_Rating = (( a + b + c + d )/6) * 100;
		
	
		System.out.printf("The QB_Rating is %.2f", QB_Rating);
						
	}
		
}

