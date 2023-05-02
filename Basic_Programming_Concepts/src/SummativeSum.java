
public class SummativeSum {

	public static void main(String[] args) {
		//System.out.println(addArrayElements(new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15}));
		//System.out.println(addArrayElements(new int[]{999, -60, -77, 14, 160, 301}));
		System.out.println(addArrayElements(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99}));
		
	}
	private static int addArrayElements(int[] myarra) {
		int sum=0;
		
		for(int number:myarra) sum+=number;
		return sum;
	}

}
