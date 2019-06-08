import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
		
    //break down n into each individual digit
    long individualDigit;
    long sumOfAllDigits;
    
    while (n > 0) {
        System.out.println("The first number is : " + n);
        // n % 10 will give us the last digit in the series of numbers
        individualDigit = (n % 10);
        System.out.println("The first digit of that number is : " + n % 10);
        // reassign n to it's new value (so we don't keep getting the same digit forever)
        n = n / 10;
        
        //add all digits to get sum of digits
        //muyltiply each pair of digits
        //compare to sum
    }
    
		return null;
	}
  
  	public static void calculateDigits (long n) { 
    
    }
  
}