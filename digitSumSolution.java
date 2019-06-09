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
    
    //select two digits (exclusive of themselves)
    for(long digit : allNumbersInN) {
      int index = 0;
      
      for(int i = 0; i < allNumbersInN.size(); i++) {
        if(i == index) {
            i++;
        }
        long numberToCompare = allNumbersInN.indexOf(i);
  
      }
    
    
    }
    
    
    //add up all digits (minus the two in question)
    
    //multiply two comparison digits
    
      return null;
  }
}