package service;

/**
 * // TODO .
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class Converter {
	public double stepToKm(final int step) {
		return step * 0.000_075;
//		return step * STEP_IN_CM / CM_IN_KM;
	}
}
