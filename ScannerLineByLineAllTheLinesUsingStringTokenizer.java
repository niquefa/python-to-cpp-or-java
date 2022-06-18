import java.util.*;

public class ScannerLineByLineAllTheLinesUsingStringTokenizer {

	public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int testCasesNumber = Integer.parseInt(sn.nextLine().trim());
        for(int test = 0; test < testCasesNumber; ++test ) {

            System.out.println("\nTest case: "+test);

            StringTokenizer st = new StringTokenizer(sn.nextLine().trim());
            int rows = Integer.parseInt(st.nextToken());
            int cols = Integer.parseInt(st.nextToken());
            for( int i = 0; i < rows; ++i ) {
                st = new StringTokenizer(sn.nextLine().trim());

                System.out.println("Processing row "+i);

                for( int j = 0; j < cols; ++j ) {
                    String word = st.nextToken();

                    System.out.println("Word in position ("+i+","+j+") : "+word);
                }
            }
        }
		sn.close();
	}
}
