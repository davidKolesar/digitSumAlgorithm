import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static java.lang.Math.toIntExact;
import java.util.HashMap;
public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
    HashMap<Long, Long> solutions = new HashMap<Long, Long>();
	      
    // get sum of all numbers in list
    long sumOfAllNumbers =  n*(n+1)/2;
 
 
    for (int i = n; i > 0; i-- ) {
 
     /* 
     * Since we know : sumOfAllNumbers * i = sum - sumOfAllNumbers - i
     * If we add 'sumOfAllNumbers' to both sides :  sumOfAllNumbers * i + sumOfAllNumbers = sum - i
     * Simplify each side: sumOfAllNumbers * i + sumOfAllNumbers * 1
     * Simply further :  sumOfAllNumbers(i+1)
     * divide both sides by i+1 : sumOfAllNumbers = (sum-i) / (i+1)
     */
      
      numberToCompare  = (sumOfAllNumbers-i) / (i+1)
 
    }
    
 

}