package gugudanClass;

public class gugudanClass {
	public static int[] calculate(int item, int second){
		int[] result = new int[second];
		for(int i = 0; i < second; i++) {
			result[i] = item * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		int count = result.length;
		int countComma = 1;
		for(int i = 0; i < count; i++) {
			System.out.print(result[i]);
			if(countComma == count) {
				System.out.print("");
			}else {
				System.out.print(", ");
			}
			countComma++;
		}
		System.out.println();
	}
	
}
