import java.util.*;
public class didwegeteverythingcovered {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 0; testCase < t; testCase++){
            long x = sc.nextLong();
            long n = sc.nextLong();
            long maxBalance = 0;
            for(int i = 1; i <= Math.sqrt(x); i++){
                long divisorOne = -1;
                long divisorTwo = -1;

                if(x%i==0){
                    divisorOne = i;
                    divisorTwo = x / i;
                }
                if(divisorOne != -1 && x / divisorOne >= n){
                    maxBalance = Math.max(maxBalance, divisorOne);
                }

                if(divisorTwo != -1 && x / divisorTwo >= n) {
                    maxBalance = Math.max(maxBalance, divisorTwo);
                }
            }
            System.out.println(maxBalance);
        }
    }
}
