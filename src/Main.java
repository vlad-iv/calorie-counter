import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import model.StepData;
import service.StepTracker;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(System.out);
        while (true) {
            System.out.println("Введите команду (подсказка)");
            final String команда = scanner.nextLine();
			if (команда.equals("2")) {
				System.out.println("Загрузка из файла:");
				final String file = readFileContentsOrNull("resources/2021.csv");
//                System.out.println(file);
				final String[] строки = file.split(System.lineSeparator());
				for (int i = 1, строкиLength = строки.length; i < строкиLength; i++) {
					String строка = строки[i];

					final String[] колонки = строка.split(",");
//                    for (String колонка : ) {
//                        System.out.println(колонка);
//                        break;
//                    }
					final int месяц = Integer.parseInt(колонки[0]);
					final int день = Integer.parseInt(колонки[1]);
					final int шаги = Integer.parseInt(колонки[2]);
					stepTracker.сохранитьШаги(new StepData(2022, месяц, день, шаги));

				}

			} else if (команда.equals(CMD_GOAL)) {
//* Ввод вашей цели по количеству шагов в день;
				System.out.println("Введите цель (количеству шагов в день):");
				final String line = scanner.nextLine();// 1000 12 - ошибка
				final int количество = Integer.parseInt(line);
				stepTracker.задатьКоличествоШагов(количество);
			} else if (команда.equals("3+")) {
//* Ввод вашей цели по количеству шагов в день;
				System.out.println("Цель: " + stepTracker.цель());
			} else if (команда.equals("4")) {
				StepData result = readStepDataFromConsole(scanner);
				stepTracker.сохранитьШаги(result);
//            }
//                else if (команда.equals("5")) {
////* Вывод статистики за определённый ГОД.
//                System.out.println("команда: " + команда);
			} else if (команда.equals("exit")) {
				break;
			} else {
				System.out.println("команда: " + команда);
			}
		}
	}

	private static StepData readStepDataFromConsole(Scanner scanner) {
		System.out.println("Введите год:");
		String line = scanner.nextLine();
		final int год = Integer.parseInt(line);

		System.out.println("Введите месяц:");
		line = scanner.nextLine();
		final int месяц = Integer.parseInt(line);

		System.out.println("Введите день:");
		line = scanner.nextLine();
		final int день = Integer.parseInt(line);

		System.out.println("Введите кол-во шагов:");
		line = scanner.nextLine();
		final int шаги = Integer.parseInt(line);
		StepData result = new StepData(год, месяц, день, шаги);
		return result;
	}


	private static String readFileContentsOrNull(String path) {
		try {
			return Files.readString(Path.of(path));
		} catch (IOException e) {
			System.out.println("Невозможно прочитать файл. Возможно, файл не находится в нужной директории.");
			return null;
		}
	}

	public static final String CMD_GOAL = "3";
}

