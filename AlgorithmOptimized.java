import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static java.lang.Math.toIntExact;
import java.util.HashMap;
import java.util.Map;

//consider solution posted : https://math.stackexchange.com/questions/3256551/algorithm-for-evaluating-a-sequence-while-removing-from-that-sequence/3256564#3256564

public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
    HashMap<Long, Long> solutions = new HashMap<Long, Long>();
    List<long[]> returnValue = new ArrayList<long[]>();
	      
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
 
     // ensure number to compare is smaller than n
     if (numberToCompare < n ) {
       solutions.put(numberToCompare, i);
     }
     
     //put solutions into array
     long[] answers = new long[solutions.size()];
     int index = 0;
     
     for (Map.Entry<Long,Long> entry : solutions.entrySet()) {
       
       answers[index] = entry.getKey();
       answers[index] = entry.getValue();
       index++;
      }
    returnValue.add(answers);
      
    }
    
  return returnValue;
}
}
