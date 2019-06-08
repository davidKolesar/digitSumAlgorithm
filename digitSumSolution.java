import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
		
    //break down n into each individual digit
    long individualDigit;
    long sumOfAllDigits;
    List<Long> digitsToAdd = new ArrayList<Long>();
    
    while (n > 0) {
        // n % 10 will give us the last digit in the series of numbers
        System.out.println("The first number is : " + n);
        individualDigit = (n % 10);

        // reassign n to it's new value (so we don't keep getting the same digit forever)
        System.out.println("The first digit of that number is : " + n % 10);
        n = n / 10;
        
        //store each individual digit
        digitsToAdd.add(individualDigit);
    }       
    
    //add all digits to get sum of digits
    sumOfAllDigits = addAllDigits(long n);
        
        //multiply each pair of digits
        //compare to sum
		return null;
	}
  
  	public static long addAllDigits( List<Long> digitsToAdd) { 
      long sumOfDigits;
    
      for(long digit : digitsToAdd) {
        sumOfDigits = sumOfDigits + digit;
      }
      
        return sumOfDigits;
    }
  
}