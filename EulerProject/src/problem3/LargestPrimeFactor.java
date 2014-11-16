package problem3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 * @author Antti Eloranta
 * 
 */
public class LargestPrimeFactor {

	public static void main(String[] args) {
		List<Double> factorList = new ArrayList<Double>();
		Scanner input = new Scanner(System.in);
		System.out.println("Largest prime factor\nAntti Eloranta 2014");
		System.out.print("Which number's largest factor you'd like to know?");
		double number = input.nextDouble();
		double factor = 0;
		input.close();
		for (double i = 2; i < number; i++) {
			if (number % i == 0) {
				factor = i;
				if (factorList.size()!=0){
					boolean found=false;
					for (int k=0; k<factorList.size();k++){
						double compare = factorList.get(k);
						if (factor%compare==0 ){
							found=true;
						}
					}
					if(!found){
						factorList.add(factor);
						System.out.println(factor);
					}
				}
				else{
					factorList.add(factor);
					System.out.println(factor);
				}
			}

		}
		System.out.println("Factors");
		for (int o=0; o<factorList.size();o++){
			System.out.println(factorList.get(o));
		}

	}

}
