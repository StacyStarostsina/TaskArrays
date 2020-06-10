package by.stacy.mass.part1;

public class Task04 {
	public static void main(String [] args) {
		int [] mas = {1, -2, 3, 4};
		solveTask04(mas);
	}
	
	public static void solveTask04(int[]ar) {
		for (int i = 0; i<(ar.length)-1; i++) {
			if (ar[i]<(ar[i+1])) {
				System.out.println("Последовательность возрастающая");
			}
			else {
				System.out.println("Последовательность не возрастающая");
			break;
			}
		}
		
	}
}
