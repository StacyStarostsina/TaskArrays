package by.stacy.mass.part1;

public class Task05 {
	public static void main (String [] args) {
		int [] mas = {1, 3, 4, 10};
		int[] result;
		result = solveTask05(mas);
		
		print(mas);
		System.out.println();
		print(result);
	}
	
	public static int Counter(int[]ar) {
		int k = 0;
		for(int i = 0; i<ar.length; i++ ) {
			if((ar[i])%2==0) {
				k++;
			}	
		}
		return k;
	}
	public static int[] solveTask05(int[]array) {
		int k = 0;
		k = Counter(array);
		int [] result = new int[k];   
		int j = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				result[j]=array[i];
				j++;
			}
		}
		return result;
	}
	
	public static void print(int [] ar) {
		for (int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
