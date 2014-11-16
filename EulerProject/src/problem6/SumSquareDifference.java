
package problem6;

/**
 * @author Antti Eloranta
 *
 */
public class SumSquareDifference {
	public static void main(String[] args) {
		int squareSum=0;
		for(int i=1; i<=100;i++){
			int square=i*i;
			squareSum+=square;
		}
		System.out.println("Sum of the squares 1-100 is " + squareSum);
		int sumSquare=0;
		for(int k=1; k<=100; k++){
			sumSquare+=k;
		}
		System.out.println("Square of the sum 1-100 is " + sumSquare*sumSquare);
		System.out.println("The difference between these sums is " + (squareSum - (sumSquare*sumSquare)));

	}

}
