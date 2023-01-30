import java.util.Scanner;

/**
 * // TODO .
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class StepTracker {

	Scanner scanner;
	Converter converter;
	MonthData[] monthToData;
	int цель;

	StepTracker(Scanner scan) {
		scanner = scan;
		converter = new Converter();

		monthToData = new MonthData[12];
		for (int i = 0; i < 12; i++) {
			monthToData[i] = new MonthData();
		}
	}

	void addNewNumberStepsPerDay() {
		System.out.println("Введите номер месяца (0 - 11)");
		printMonth();
		int month = scanner.nextInt();
		// ввод и проверка номера месяца

		System.out.println("Введите день от 1 до 30 (включительно)");
		int day = scanner.nextInt();
		// ввод и проверка дня

		System.out.println("Введите количество шагов");
		int step = scanner.nextInt();
		// ввод и проверка количества шагов

		// сохранение данных
		MonthData monthData = monthToData[month];
		int[] days = monthData.days;
		days[day - 1] = step;
	}

	void printStatistic() {
		System.out.println("Введите число месяца (0 - 11)");
		printMonth();
		int month = scanner.nextInt();
		if (month < 0 || month > 11) {
			// Ошибка
			return;
		}
		// ввод и проверка номера месяца
		MonthData monthData = monthToData[month];
		System.out.println("вывод общей статистики");
		System.out.println("вывод суммы шагов за месяц: " + monthData.sumStepsFromMonth());
		System.out.println("вывод максимального пройденного количества шагов за месяц:" + monthData.sumStepsFromMonth());
		System.out.println("подсчёт и вывод максимального пройденного количества шагов за месяц");
		System.out.println("вывод пройденной за месяц дистанции в км: " + converter.stepToKm(monthData.sumStepsFromMonth()));
		System.out.println("вывод количества сожжённых килокалорий за месяц");
		System.out.println("вывод лучшей серии");
		System.out.println(); //дополнительный перенос строки
	}
	private void printMonth() {
		System.out.println("Январь - 0, .... Декабрь - 11");
	}
	public void задатьЦель() {
		System.out.println("Введите  цель:");
		цель = scanner.nextInt();
	}
}
