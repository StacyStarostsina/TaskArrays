package by.stacy.mass.part1;

public class Task03 {
	public static void main(String [] args) {
		int mas [] = {-2, 2, 3};
		solveTask03(mas);
	}
	
	public static void solveTask03(int [] ar){
		for(int i=0; i < ar.length;) {
			if (ar[i]>0){
				System.out.println("First number positive.");
				break;
			}
			else {
				System.out.println("First number negative.");
				break;
			}
		}
	}

}
