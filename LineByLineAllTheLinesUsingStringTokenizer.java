import java.io.*;
import java.util.*;

public class LineByLineAllTheLinesUsingStringTokenizer {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCasesNumber = Integer.parseInt(br.readLine().trim());
        for(int test = 0; test < testCasesNumber; ++test ) {

            System.out.println("\nTest case: "+test);

            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int rows = Integer.parseInt(st.nextToken());
            int cols = Integer.parseInt(st.nextToken());
            for( int i = 0; i < rows; ++i ) {
                st = new StringTokenizer(br.readLine().trim());

                System.out.println("Processing row "+i);

                for( int j = 0; j < cols; ++j ) {
                    String word = st.nextToken();

                    System.out.println("Word in position ("+i+","+j+") : "+word);
                }
            }
        }
		br.close();
	}
}
