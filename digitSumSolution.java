import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static java.lang.Math.toIntExact;
public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
    List<Long> allNumbersInN = new ArrayList<Long>();
    Hashmap<Long, Long> solutions = new Hashmap<Long, Long>();
	
    //get each number between 1 and n
    for(long i = 0; i < n; i++) {
        allNumbersInN.add(i);
      }
      
    // get sum of all numbers in list
    long sumOfAllNumbers = AddUpAllNumbersInList(allNumbersInN);
    
    //select two digits (exclusive of themselves)
    for(long number : allNumbersInN) {
      int index = 0;
      
      for(int i = 0; i < allNumbersInN.size(); i++) {
        if(i == index) {
            i++;
        }
        long numberToCompare = allNumbersInN.indexOf(i);
        
        //subtract each both numbers from sum
        long numberToSubtract = (number + numberToCompare);
        sumOfAllNumbers = (sumOfAllNumbers -= numberToSubtract)
        
        // compare product to sum
        long productOfTwoNumbers = (numberToCompare * number); 
        
        if(productOfTwoNumbers == sumOfAllNumbers){
          solutions.put (number, numberToCompare);
        }
        //add difference back to original sum
         sumOfAllNumbers = (sumOfAllNumbers += numberToSubtract)
      }
    }
      return null;
  }
  
  private static AddUpAllNumbersInList(List<Long> allNumbersInN ) {
    long sumOfAllNumbers = 0;
    for(long number : allNumbersInN) {
    
      sumOfAllNumbers = (sumOfAllNumbers + number);
    }
  
    return sumOfAllNumbers;
}