package service;

import java.io.PrintStream;
import java.util.HashMap;

import model.StepData;
import model.Месяц;

/**
 * // TODO .
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class StepTracker {

	private int цель;
	private final HashMap<Integer, Месяц> годМесяцШаги;
	private PrintStream out;

	public StepTracker() {
		this(System.out);
	}

	public StepTracker(PrintStream out) {
		this.цель = 10_000;
		this.годМесяцШаги = new HashMap<>();
		this.out = out;
	}

	/**
	 * Сохраняет цель.
	 *
	 * @param количество
	 */
	public void задатьКоличествоШагов(int количество) {
		out.println("Сохранили цель: " + количество);
		цель = количество;
	}

	/**
	 * Сохраняет количество шагов за день.
	 * Преполагаем в каждом месяце 30 дней.
	 */
	public void сохранитьШаги(StepData data) {
		out.println("Сохранила шаги: " + data.шаги);
		final int годаВмесяцах = data.получитьГодаВмесяцах();
		Месяц шагиЗаМесяц = годМесяцШаги.get(годаВмесяцах);
		if (шагиЗаМесяц == null) {
			шагиЗаМесяц = new Месяц();
			годМесяцШаги.put(годаВмесяцах, шагиЗаМесяц);
		}
		шагиЗаМесяц.задатьШаги(data.день, data.шаги);
	}

	public String цель() {
		return String.valueOf(цель);
	}
}
