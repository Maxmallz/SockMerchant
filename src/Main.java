import java.io.*;
import java.util.*;
public class Main {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int sockPairs = 0;
        int i = 0;
        Arrays.sort(ar);

        while(i < n){
            if(i + 1 >= n){break;}
            int sockA = ar[i];
            int sockB = ar[i + 1];//check for bounds

            if(sockA == sockB){
                sockPairs++;
                i += 2;
            }
            else{
                i += 1;
            }
        }
        return sockPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
