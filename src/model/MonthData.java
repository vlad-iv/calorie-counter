package model;

public class MonthData {
	int[] days = new int[30];

	void printDaysAndStepsFromMonth() {
		for (int i = 0; i < 30; i++) {
			// Вывод элементов массива в необходимом формате
		}
	}

	int sumStepsFromMonth() {
		int sumSteps = 0;
		for (int i = 0; i < 30; i++) {
			// подсчёт суммы элементов массива days[]
		}
		return sumSteps;
	}

	int maxSteps() {
		int maxSteps = 0;
		for (int i = 0; i < 30; i++) {
			final int шаги = days[i];
			if (шаги > maxSteps) {

			}
				// поиск максимального элемента
		}
		return maxSteps;
	}

	// 1-2 по 10_000 и 28-30 - 11_000
	// 28-30 - 11_000
	int bestSeries(int goalByStepsPerDay) {
		int bestSession = 0;
		int countBest = 0;
		for (int i = 0; i < 30; i++) {
			final int шаги = days[i];
			if (шаги >= goalByStepsPerDay) {
				bestSession++;
			} else {
				// TODO устаносить countBest и очистить bestSession
			}
			// поиск максимальной серии
		}
		return countBest;
	}

	public void задатьШаги(int день, int шаги) {
		days[день - 1] = шаги;
	}
}
