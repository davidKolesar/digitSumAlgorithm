import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
		
    //break down each digit
    long individualDigit;
    
    while (n > 0) {
        System.out.println("The first number is : " + n);
        individualDigit = (n % 10);
        System.out.println("The first digit of that number is : " + n % 10);
        n = n / 10;
    }
    
    
		return null;
	}
}