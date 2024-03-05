package telran.numbers;
/**
 * 
 * Calculator utility class for basic mathematical operations.
 * <br>Supports only 'double' data type operands.
 * <p>Operations supported:
 * 
 * <li>Summing</li> 
 * <li>Subtraction</li> 
 * <li>Multiplication</li> 
 * <li>Division</li>
 * @version 1.0.0
 * @author roman zolotaryov
 */
public class Calculator {
	
	/**
	 * Sums 2 double type values
	 * <br>In simple words performs: (operand1 + operand2)
	 * 
	 * @since 1.0.0
	 * @author roman zolotaryov 
	 * @param operand1 - double value
	 * @param operand2 - double value
	 * @return result of 'summing' operation between operand1 and operand2
	 */
	public static double sum(double operand1, double operand2) {
		return operand1 + operand2;
	}
	
	/**
	 * Subtracts operand2 from operand1
	 * <br>In simple words performs: (operand1 - operand2)
	 * 
	 * @since 1.0.0
	 * @author roman zolotaryov 
	 * @param operand1 - double value
	 * @param operand2 - double value
	 * @return result of 'subtraction' operation between operand1 and operand2
	 */
	public static double sub(double operand1, double operand2) {
		return operand1 - operand2;
	}
	
	/**
	 * Multiplies operand1 by operand2
	 * <br>In simple words performs: (operand1 * operand2)
	 * 
	 * @since 1.0.0
	 * @author roman zolotaryov 
	 * @param operand1 - double value
	 * @param operand2 - double value
	 * @return result of 'multiplication' operation between operand1 and operand2
	 */
	public static double mul(double operand1, double operand2) {
		return operand1 * operand2;
	}
	
	/**
	 * Divides operand1 by operand2
	 * <br>In simple words performs: (operand1 / operand2)
	 * 
	 * Exceptional cases: 
	 * <li>operand1 > 0 and operand2 == 0: will return Double.Positive_Infinity
	 * <li>operand1 < 0 and operand2 == 0: will return Double.Negative_Infinity
	 * <li>operand1 == 0 and operand2 == 0: will return Double.NaN (Not-A-Number)
	 * 
	 * @since 1.0.0
	 * @author roman zolotaryov 
	 * @param operand1 - double value
	 * @param operand2 - double value
	 * @return result of 'division' operation between operand1 and operand2
	 */
	public static double div(double operand1, double operand2) {
		return operand1 / operand2;
	}
}
