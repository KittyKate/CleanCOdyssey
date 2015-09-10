package Problems;

import java.math.BigInteger;

public class P5_Sum_square_difference {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int square=0;
	int sum=0;
	for(int f = 1; f <= 100; f++){
	    square += Math.pow(f, 2);
	    sum += f;
	}
	
	
	BigInteger Intsquare = new BigInteger(square+""); 
	BigInteger Intsum = new BigInteger(sum+"");
	
	
	System.out.println("Differenz: " + Intsum.pow(2).subtract(Intsquare));
	
    }

}
