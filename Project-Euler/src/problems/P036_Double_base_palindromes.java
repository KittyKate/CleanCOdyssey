/**
 * 
 */
package problems;

/*
 * P36.java 
 *
 * @author Gott50
 * 17.06.2014 
 * 
 * Ergebnis: 872187
 */
public class P036_Double_base_palindromes {

    public static void main(String[] args) {
//	System.out.println(isSearched(585));
	
	long sum = 0;
	for(int i = 0; i < 1000000; i++)
	    if(isSearched(i)){
		sum += i;
		System.out.println("10: "+i);
		System.out.println("2:  " + toDual(i));
	    }
	System.out.println("Ergebnis: " + sum);
	    

    }

    public static boolean isPalindrome(String str) {
	String test = str;

	for (int t = 0; t < test.length(); t++) {
	    if (test.charAt(t) != test.charAt(test.length() - 1 - t)) {
		return false;
	    }
	}
	return true;
    }

    public static String toDual(int n) {
	String out = "";
	do {
	    out = (n % 2) + out;
	    n /= 2;
	}while (n >= 1);
	
	return out;
    }

    public static boolean isSearched(int n) {
	String str = n + "";
	if (isPalindrome(str))
	    if (isPalindrome(toDual(n)))
		return true;

	return false;
    }
}
