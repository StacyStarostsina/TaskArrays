package by.stacy.mass.part1;

public class Task08 {
	public static void main (String [] args) {
		int [] mas = {14, 23, 55, -1, 0, -4, 13, 0, 0};
		Positive(mas);
		Negative(mas);
		Noliks(mas);
	
	}
	
	public static void Positive(int [] ar){
		int p = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>0) {
				p++;
			}
		}
		System.out.println("Количество положительных значений: "+p);
	}
	
	public static void Negative(int [] ar) {
		int n = 0;
		for(int i = 0; i < ar.length; i++) {
			if(ar[i]<0) {
				n++;
			}
		}
		System.out.println("Количество негативных значений: "+n);
	}
	
	public static void Noliks(int [] ar) {
		int n = 0;
		for (int i = 0; i<ar.length; i++) {
			if(ar[i]==0) {
				n++;
			}
		}
		System.out.println("Количество отрицательных значений: "+n);
	}
}
