package model;

/**
 * Data of step and day.
 */

public class StepData {
	public final int год;
	public final int месяц;
	public final int день;
	public final int шаги;

	public StepData(int год, int месяц, int день, int шаги) {
		this.год = год;
		this.месяц = месяц;
		this.день = день;
		this.шаги = шаги;
	}

	/**
	 * Переводит года в месяцы
	 *
	 * @return кол-во месяцев
	 */
	public int получитьГодаВмесяцах() {
		return this.год * 12 + this.месяц;
	}
}
