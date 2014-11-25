package problems;
/**
 * 
 */


/**
 * @author Antti Eloranta
 *
 */
public class P5_SmallestMultiple {

	public static void main(String[] args) {
		System.out.println("Calculating the smallest positive number divisible with numbers 1-20. This may take some time.");
		boolean found=false;
		int number=1;
		while(!found){
			for(int i=1, probFound = 0; i<=20 || probFound==0; i++ ){
				if(number%i!=0){
					probFound=1;
				}
				if (i==20 && probFound==0){
					found=true;
					System.out.println(number);
					System.exit(0);
				}
			}
			number++;
		}

	}

}
