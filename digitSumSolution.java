import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static java.lang.Math.toIntExact;
public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
    List<Long> allNumbersInN = new ArrayList<Long>();
	
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
        sumOfAllNumbers = (sumOfAllNumbers -= (number + numberToCompare))
        
        
        long productOfTwoNumbers = (numberToCompare * number); 

        
      }
    
    
    }
    
  
    
    
    
    //multiply two comparison digits
    
      return null;
  }
  
  private static AddUpAllNumbersInList(List<Long> allNumbersInN ) {
    long sumOfAllNumbers = 0;
    for(long number : allNumbersInN) {
    
      sumOfAllNumbers = (sumOfAllNumbers + number);
    }
  
    return sumOfAllNumbers;
}