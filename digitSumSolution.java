import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static java.lang.Math.toIntExact;
public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
		
    //break down n into each individual digit
    long currentDigit;
    long sumOfAllDigits = 0;
    List<Long> digitsToAdd = new ArrayList<Long>();
    List<Long> products = new ArrayList<Long>();
    
    while (n > 0) {
        // n % 10 will give us the last digit in the series of numbers
        System.out.println("The first number is : " + n);
        currentDigit = (n % 10);

        /*
        *to save memory and make work easeir, we can convert each long to 
        *an integer since each one is only one digit (and will therefore
        *convert correctly). With Java 8 'java.lang.Math.toIntExact', it
        * will throw an arithmetic exception in case of overflow. See
        *https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#toIntExact-long-
        */
        try {
          int individualDigit = toIntExact(currentDigit);
        } 
          catch(Exception e) {
            /*
            * TODO: This will terminate the program in case of overflow. There could be
            * another code path that handles the exception by executing a flow with Longs.
            */
            System.out.println("Long overflowed during conversion to int. This is a terminal failure. Error : " + e);
            System.exit(0); 
          }
                  
        //store each individual digit
        digitsToAdd.add(individualDigit);

        // reassign n to it's new value (so we don't keep getting the same digit forever)
        System.out.println("The first digit of that number is : " + n % 10);
        n = n / 10;
    }       
    
    //add all digits to get sum of digits
    sumOfAllDigits = AddAllDigits(digitsToAdd);
        
    //multiply each pair of digits
    generateCombinations(digitsToAdd);
    
    //compare to sum
    
    
		return null;
	}
  
  	private static long AddAllDigits( List<Long> digitsToAdd) { 
      long sumOfDigits = 0;
    
      for(long digit : digitsToAdd) {
        sumOfDigits = sumOfDigits + digit;
      }
      
        return sumOfDigits;
    }
    
/*
 *Uses Iterative Algorithm to generates combinations by combining
 * all possible *pairs  of multiples (does not work for not permutations)
 */
private static void generateCombinations(List<Long> digitsToAdd) {

int[] input = {10, 20, 30, 40, 50};    // input array

int k = 3;                             // sequence length   

List<int[]> subsets = new ArrayList<>();

int[] s = new int[k];                  // here we'll keep indices 
                                       // pointing to elements in input array

if (k <= input.length) {
    // first index sequence: 0, 1, 2, ...
    for (int i = 0; (s[i] = i) < k - 1; i++);  
    subsets.add(getSubset(input, s));
    for(;;) {
        int i;
        // find position of item that can be incremented
        for (i = k - 1; i >= 0 && s[i] == input.length - k + i; i--); 
        if (i < 0) {
            break;
        }
        s[i]++;                    // increment this item
        for (++i; i < k; i++) {    // fill up remaining items
            s[i] = s[i - 1] + 1; 
        }
        subsets.add(getSubset(input, s));
    }
}

}

// generate actual subset by index sequence
private static int[] getSubset(int[] input, int[] subset) {
    int[] result = new int[subset.length]; 
    for (int i = 0; i < subset.length; i++) 
        result[i] = input[subset[i]];
    return result;
}

}