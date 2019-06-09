import java.util.*;
import org.junit.Test;
public class RemovedNumbers {
	
	public static String removNb(long n) {
    HashMap<Long, Long> solutions = new HashMap<Long, Long>();
    String retVal = "";
	      
    // get sum of all numbers in list
    long sumOfAllNumbers =  n*(n+1)/2;
 
 
    for (long i = n; i > 0; i-- ) {
 
     /* 
     * Since we know : sumOfAllNumbers * i = sum - sumOfAllNumbers - i
     * If we add 'sumOfAllNumbers' to both sides :  sumOfAllNumbers * i + sumOfAllNumbers = sum - i
     * Simplify each side: sumOfAllNumbers * i + sumOfAllNumbers * 1
     * Simply further :  sumOfAllNumbers(i+1)
     * divide both sides by i+1 : sumOfAllNumbers = (sum-i) / (i+1)
     */     
      long numberToCompare  = (sumOfAllNumbers-i) / (i+1);
 
     // ensure number to compare is smaller than nreturnValue
     if (numberToCompare < n ) {
       solutions.put(numberToCompare, i);
     }


     for (Map.Entry<Long,Long> entry : solutions.entrySet()) {
       String key = Long.toString(entry.getKey());
       String value = Long.toString(entry.getValue());

      retVal = retVal + key + " " + value + "," + " ";

      }
    }
        return retVal;
  }
}