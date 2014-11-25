package problems;
/**
 * 
 */


/**
 * @author Antti Eloranta
 *
 */
public class P2_FibonacciNumbers {

	public static void main(String[] args) {
		int first=1,second=2, newNum=0, sum=0;
		sum+=second;
		while(newNum<4000000){
			newNum=first+second;
			first=second;
			second=newNum;
			
			if(newNum%2==0){
				sum+=newNum;
				System.out.println(newNum);
			}
		}
		System.out.println("Final sum is "+sum);
		System.exit(0);
	}

}
