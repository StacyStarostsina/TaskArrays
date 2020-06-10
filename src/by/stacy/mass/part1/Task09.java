package by.stacy.mass.part1;

public class Task09 {
	public static void main(String[] args) {
		int[] mas = { -5, 0, 3, 8 };
		int max = 0;
		int min = 0;
		int hlp = 0;

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = i;
			} else {
				if (mas[i] < min) {
					min = i;
				}
			}
		}
		System.out.println();

		System.out.println(min);
		System.out.println(max);

		hlp = mas[min];
		mas[min] = mas[max];
		mas[max] = mas[hlp];

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}
