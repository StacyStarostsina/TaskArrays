package by.stacy.mass.part1;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] mas = new int[10];
		
		initwithRandom(mas);
		print(mas);
		task1(mas);
	}

	public static void task1(int[] ar) {
		int k = 10;

		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % k == 0) {
				sum = sum + ar[i];
			}
		}
		System.out.println("sum = " + sum);
	}

	public static void initwithRandom(int[] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);
		}
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
