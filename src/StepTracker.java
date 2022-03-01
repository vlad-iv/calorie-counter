import java.util.HashMap;

/**
 * // TODO .
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class StepTracker {

	private int цель;
	private final HashMap<Integer, Месяц> годМесяцШаги = new HashMap<>();

	/**
	 * Сохраняет цель.
	 *
	 * @param количество
	 */
	public void задатьКоличествоШагов(int количество) {
		System.out.println("Сохранили цель: " + количество);
		цель = количество;
	}

	/**
	 * Сохраняет количество шагов за день.
	 * Преполагаем в каждом месяце 30 дней.
	 */
	public void сохранитьШаги(int год, int месяц, int день, int шаги) {
		System.out.println("Сохранила шаги: " + шаги);
		final int годаВмесяцах = год * 12 + месяц;
		Месяц шагиЗаМесяц = годМесяцШаги.get(годаВмесяцах);
		if (шагиЗаМесяц == null) {
			шагиЗаМесяц = new Месяц();
			годМесяцШаги.put(годаВмесяцах, шагиЗаМесяц);
		}
		шагиЗаМесяц.задатьШаги(день, шаги);
	}

	public String цель() {
		return String.valueOf(цель);
	}
}
