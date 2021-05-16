package gugudanClass;

public class gugudanClass {
	public static int[] calculate(int item){
		int[] result = new int[9];
		for(int i = 0; i < 9; i++) {
			result[i] = item * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
}
