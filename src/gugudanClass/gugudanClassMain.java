package gugudanClass;
import java.util.Scanner;

public class gugudanClassMain {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		String inputValue = scanf.nextLine();
		String[] splitedValue = inputValue.split(",");

		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		System.out.println("1번 : "+ first + "  " + "2번 : " + second);
		
		for(int i = 2; i <= first; i++) {
			int[] result = gugudanClass.calculate(i, second);
			gugudanClass.print(result);
		}
	}
}
