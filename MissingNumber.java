import java.io.IOException;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long sum = 0;
        for(int i = 1;i<=n;i++ ){
            sum+=i;
        }
        for(int i=0;i<n-1;i++){
            int num = sc.nextInt();
            sum = sum - num;

        }

        System.out.println(sum);
	}
}
