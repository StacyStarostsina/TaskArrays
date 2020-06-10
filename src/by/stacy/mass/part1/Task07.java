package by.stacy.mass.part1;

public class Task07 {
	public static void main(String[] args) {
		int[] mas = { 47, 11, 9, 32, 1 };
		int[] result;
		print(mas);
		Counter(mas);
		result = FinalArray(mas);
		print(result);
	}

	public static void Counter(int[] ar) {
		int z = 23;
		int j = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] > z) {
				j++;
			}
		}
		System.out.println("\nКоличество замен: "+j);
		
	}
	
	public static int[] FinalArray(int [] ar) {
		int z = 23;
		int j = 0;
		int [] result = new int [ar.length];
		for( int i = 0; i < ar.length; i++) {
			if(ar[i]>z) {
				j=i;
				result[j]=z;
			}
			else {
				j=i;
				result[j]=ar[i];
				
			}
		}
		return result;
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}

