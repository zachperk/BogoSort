package bogoSort;

public class BogoSort {
	
	private static int COUNT = 0;
	
	public static boolean checkSortedAsc(int[] arr) {
		int last = Integer.MIN_VALUE;
		for (int num : arr){
			if (num < last) {
				return false;
			}
			last = num;
		}
		return true;
	}

	public static void bogoSort(int[] arr) {
		COUNT = 0;
		while (checkSortedAsc(arr) != true) {
			int randInd1 = (int) (Math.random() * arr.length);
			int randInd2 = (int) (Math.random() * arr.length);
			int temp = arr[randInd1];
			arr[randInd1] = arr[randInd2];
			arr[randInd2] = temp;
			COUNT++;
		}
	}
	
	public static int getCount() {
		return COUNT;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,7,2,9,2,5,3,4,8,0,9,4};
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		bogoSort(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("Iterations: " + getCount());
	}

}
