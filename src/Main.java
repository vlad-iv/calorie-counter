import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StepTracker stepTracker = new StepTracker(scanner);
		while (true) {
			printMenu();

			String command = scanner.nextLine();
			if (command.equals("1")) {
				stepTracker.addNewNumberStepsPerDay();
			} else if (command.equals("2")) {
				stepTracker.задатьЦель();
			} else if (command.equals("3")) {
				// вывести статистику
				stepTracker.printStatistic();
			} else if (command.equals("4")) {
				System.out.println("Пока!");
				scanner.close();
				return;
			} else {
				System.out.println("Такой команды нет");
			}
		}
	}

	static void printMenu() {
		System.out.println("Введите команду (4 - выход");
	}
}

