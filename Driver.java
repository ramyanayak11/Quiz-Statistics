
/* 
 * Name: RAMYA NAYAK
 * Date: June 06, 2022
 */


import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Student lab2 [] = new Student[41];
		int optionNum;
		
		for (int i = 0; i < 41; ++i) {
			lab2[i] = new Student();
		}

		// Replace the first parameter with the appropriate filepath to run universally
		lab2 = FileIO.readFile("/Users/ramyanayak/eclipse-workspace/Assignment 5/src/studentGrades.txt", lab2);
		
		Statistics statlab2 = new Statistics();

		statlab2.findLow(lab2);

		statlab2.findHigh(lab2);
		
		statlab2.findAvg(lab2);

		System.out.printf("\nPlease select one of the following options: \n");
		System.out.printf("1 - Lowest score for each quiz\n");
		System.out.printf("2 - Highest score for each quiz\n");
		System.out.printf("3 - Average score for each quiz\n");
		System.out.printf("4 - All of the above\n\n");
		
		optionNum = in.nextInt();
		
		if (optionNum == 1 || optionNum == 2 || optionNum == 3 || optionNum == 4) {
			statlab2.print(optionNum);
		}
		else {
			System.out.printf("\nNot a valid input. Please select one of the following options: \n");
			System.out.printf("1 - Lowest score for each quiz\n");
			System.out.printf("2 - Highest score for each quiz\n");
			System.out.printf("3 - Average score for each quiz\n");
			System.out.printf("4 - All of the above\n\n");
			
			optionNum = in.nextInt();
		}
	}
}
