
package problem1;

/**
 * @author Antti Eloranta
 *
 */
public class MultiplesOf3And5 {

	public static void main(String[] args) {
		System.out.println("Summing multiples of 3 and 5 below 1000");
		int sum=0;
	for (int i=0; i<1000;i++){
		if (i%3==0 || i%5==0){
			sum = sum+i;
		}
	}
	System.out.println("The sum is " + sum);
	}

}