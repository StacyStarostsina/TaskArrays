package by.stacy.mass.part1;

public class Task06 {
	public static void main(String[] args) {
		int[] mas = { 3, 0, -4, 1 };
		int max = 0;
		int min = 0;

		for (int i = 0; i < (mas.length) - 1; i++) {
			if (mas[i] > (max)) {
				max = mas[i];
			} else {
				min = mas[i];
			}
		}

		int dlina = Math.abs(max) + Math.abs(min);

		System.out.println("Наименьшая длина оси -- "+dlina);
	}

}
