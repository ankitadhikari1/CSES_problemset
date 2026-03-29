import java.io.IOException;
import java.util.Scanner;

public class WierdAlgorithm {
    public static void main(String[] args) throws IOException {
        long n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        while(n!=1){
            System.out.print(n+" ");
            if(n%2==0){
                n = n/2;
            }
            else{
                n = n * 3 + 1;
            }
        }
        System.out.print(n);
		
	}
}
