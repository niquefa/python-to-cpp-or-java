import java.util.*;

public class ScannerLineByLineAllTheLinesUsingSplit {

	public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int testCasesNumber = Integer.parseInt(sn.nextLine().trim());
        for(int test = 0; test < testCasesNumber; ++test ) {

            System.out.println("\nTest case: "+test);

            String arr[] = sn.nextLine().trim().split(" ");
            int rows = Integer.parseInt(arr[0]);
            int cols = Integer.parseInt(arr[1]);
            for( int i = 0; i < rows; ++i ) {
                String rowArray[] = sn.nextLine().trim().split(" ");

                System.out.println("Processing row "+i);

                for( int j = 0; j < cols; ++j ) {
                    String word = rowArray[j];

                    System.out.println("Word in position ("+i+","+j+") : "+word);
                }
            }
        }
		sn.close();
	}
}
