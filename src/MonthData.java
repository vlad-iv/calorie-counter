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
}
