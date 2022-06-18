import java.io.*;

public class LineByLineAllTheLinesUsingSplit {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCasesNumber = Integer.parseInt(br.readLine().trim());
        for(int test = 0; test < testCasesNumber; ++test ) {

            System.out.println("\nTest case: "+test);

            String arr[] = br.readLine().trim().split(" ");
            int rows = Integer.parseInt(arr[0]);
            int cols = Integer.parseInt(arr[1]);
            for( int i = 0; i < rows; ++i ) {
                String rowArray[] = br.readLine().trim().split(" ");

                System.out.println("Processing row "+i);

                for( int j = 0; j < cols; ++j ) {
                    String word = rowArray[j];

                    System.out.println("Word in position ("+i+","+j+") : "+word);
                }
            }
        }
		br.close();
	}
}
