import java.util.*;

public class ScannerTokenByToken {

	public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int testCasesNumber = sn.nextInt();
        for(int test = 0; test < testCasesNumber; ++test ) {

            System.out.println("\nTest case: "+test);

            int rows = sn.nextInt();
            int cols = sn.nextInt();
            for( int i = 0; i < rows; ++i ) {

                System.out.println("Processing row "+i);

                for( int j = 0; j < cols; ++j ) {
                    String word = sn.next();

                    System.out.println("Word in position ("+i+","+j+") : "+word);
                }
            }
        }
		sn.close();
	}
}
