
/* 
 * Name: RAMYA NAYAK
 * Date: June 06, 2022
 */


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.*;

public class FileIO {

    FileIO () {}

    // Reads given file and returns list of students
    public static Student[] readFile(String filename, Student [] stu) {
    	
    	List<String> scoreLine = new ArrayList<String>();
    	int numStudents = 0;
    	
    	try {
    		FileReader file = new FileReader(filename);
    		BufferedReader buff = new BufferedReader(file);

    		boolean eof = false;
    		
    		// Reads and prints the first line, but doesn't tokenize it
    		String line1 = buff.readLine();
    		System.out.println(line1);
    		
    		while (!eof) {
    			String line = buff.readLine();
    			if (line == null) {
    				eof = true;
    			}
    			else {
    				scoreLine.add(line);
    		    	StringTokenizer st = new StringTokenizer(line);
    		    	Student person = new Student();
    		    	int quizScores [] = new int[5];
    		    	boolean checker = true;
    		    	
    		    	while (st.hasMoreTokens()) {
    		    		if (checker == true) {
    		    			int x = Integer.parseInt(st.nextToken());
    		    			person.setSID(x);
    		    			checker = false;
    		    		}
    		    		else {
    		    			for (int i = 0; i < 5; ++i) {
    		    				quizScores[i] = Integer.parseInt(st.nextToken());
    		    			}
    		    		}
    		    	}	
    		    	person.setScores(quizScores);
    		    	stu[++numStudents] = person;
    			}
    		}
    		buff.close();
    	}
    	catch (IOException e) {
    		System.out.println("Error -- " + e.toString());
    	}
    	
    	// Prints the file
    	for (int i = 0; i < scoreLine.size(); ++i) {
    		System.out.printf(scoreLine.get(i));
    		System.out.printf("\n");
    	}
    	
    	return stu;
    }
}
