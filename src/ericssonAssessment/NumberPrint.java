package ericssonAssessment;

/**
 * 
 * 
 * @author Chunzhe Zhou
 */
public class NumberPrint {
	
//	extract static odd print method to print all the odd number
	public static void printOdd() {
//		Remind to print the odd number
		System.out.println("Below is the odd number from 1 to 100: ");
//		for loop to search all the number from 1 to 100
//		if the number can be module operated not to 0, then it is odd number
		for (int i = 1; i < 101; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
	}
	
//	extract static even print method to print all the even number from 1 to 100;
	public static void printEven() {
		System.out.println("Below is the even number from 1 to 100: ");
//		the odd print is for loop, even number is while loop
		int i = 1; 
		while(i < 101) {
			if(i % 2 == 0) {
				System.out.print(i + ", ");
			}
			i++;
		}
	}
	
//	run main method to test, in main method, use the printOdd()
	public static void main(String[] args) { 
		NumberPrint.printOdd();
	}
	
}
