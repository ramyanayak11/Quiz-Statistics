
/* 
 * Name: RAMYA NAYAK
 * Date: June 06, 2022
 */


public class Statistics {

	private int [] lowScores = new int [5];

	private int [] highScores = new int [5];

	private float [] avgScores = new float [5];
	
	public Statistics () {}

	// Finds the lowest score
	public void findLow(Student [] a) {
		for (int i = 0; i < 5; ++i) {
			// sets variable to 100 (highest score possible), so it can check if there is a lower score
			int lowestScore = 100;
			for (int c = 1; c < a.length; ++c) {
				if (a[c].getSID() == 0) {
					break;
				}
				if ((a[c].getScores()[i]) < lowestScore) {
					lowestScore = a[c].getScores()[i];
				}
			}
			lowScores[i] = lowestScore;
		}
	}

	// Finds the highest score
	public void findHigh(Student [] a) {
		for (int i = 0; i < 5; ++i) {
			// sets variable to 0(lowest score possible), so it can check if there is a higher score
			int highestScore = 0;
			for (int c = 1; c < a.length; ++c) {
				if (a[c].getSID() == 0) {
					break;
				}
				if ((a[c].getScores()[i]) > highestScore) {
					highestScore = a[c].getScores()[i];
				}
			}
			highScores[i] = highestScore;
		}
	}

	// Calculates the average
	public void findAvg(Student [] a) {
		for (int i = 0; i < 5; ++i) {
			float sum = 0.0f;
			float numStudents = 0.0f;
			for (int c = 1; c < a.length; ++c) {
				if (a[c].getSID() == 0) {
					break;
				}
				if (a[c] == null) {
					continue;
				}
				else {
					sum += (a[c].getScores()[i]);
					numStudents += 1;
				}
			}
			avgScores[i] = sum/numStudents;
		}
	}

	// Prints the user's requested statistic
	public void print(int option) {

		if (option == 1) {
			System.out.printf("\nLow scores: ");
			for (int i = 0; i < 5; ++i) {
				System.out.printf("%d%s", lowScores[i], " ");
			}
		}
		else if (option == 2) {
			System.out.printf("\nHigh scores: ");
			for (int i = 0; i < 5; ++i) {
				System.out.printf("%d%s", highScores[i], " ");
			}
		}
		else if (option == 3) {
			System.out.printf("\nAverage: ");
			for (int i = 0; i < 5; ++i) {
				System.out.printf("%.1f%s", avgScores[i], " ");
			}
		}
		else {
			System.out.printf("\nLow scores: ");
			for (int i = 0; i < 5; ++i) {
				System.out.printf("%d%s", lowScores[i], " ");
			}
			System.out.printf("\nHigh scores: ");
			for (int i = 0; i < 5; ++i) {
				System.out.printf("%d%s", highScores[i], " ");
			}
			System.out.printf("\nAverage: ");
			for (int i = 0; i < 5; ++i) {
				System.out.printf("%.1f%s", avgScores[i], "  ");
			}
		}

	}
}
