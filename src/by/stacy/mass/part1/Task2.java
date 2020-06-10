package by.stacy.mass.part1;

public class Task2 {
	public static void main(String[] args) {
		int[] mas = { 10, 0, 60, 0, 98, 0, 44, 19, 0 };
		
		int[] result;
		result = arrayTask02(mas);
		print(mas);
		print(result);
	}

	public static int zeroCounter(int[] array) {
		int zeroCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				zeroCount++;
			}
		}
		return zeroCount;
	}

	public static int[] arrayTask02(int[] ar) {
		int zeroCount = 0;

		zeroCount = zeroCounter(ar);

		int[] result = new int[zeroCount];
		int j = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				result[j] = i;
				j++;
			}
		}
		return result;

	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
}
