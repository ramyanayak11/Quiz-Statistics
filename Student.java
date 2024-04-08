
/* 
 * Name: RAMYA NAYAK
 * Date: June 06, 2022
 */


public class Student {

	private int SID;

	private int scores[] = new int[5];
	
	public Student() {}

	public void setSID (int ID) {
		 SID = ID;
	}
	
	public int getSID () {
		return SID;
	}
	 
	public void setScores (int[] Scores) {
		 scores = Scores;
	}
	
	public int[] getScores () {
		return scores;
	}
	 
	public void printSID () {
		 System.out.printf("\nSID: %d\n", SID);
	}
	
	// Prints student's scores.
	public void printScores () {
		System.out.printf("\tScores: ");
		for (int i = 0; i < scores.length; ++i) {
			 System.out.printf("%d%s", scores[i], " ");
		 }
		System.out.printf("\n");
	}
}
