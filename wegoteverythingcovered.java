import java.util.*;
public class wegoteverythingcovered {
    static long MOD = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 0; testCase < t; testCase++){
            long n = sc.nextLong();
            long m = sc.nextLong();
            long k = sc.nextLong();

            long fSum = 0;
            for(int i = 0; i < m; i++){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long f = sc.nextLong();
                fSum = (fSum + f)%MOD;
            }

            long numerator = (k%MOD * fSum%MOD)%MOD;
            numerator = (numerator*m)%MOD;
            long nChooseTwo = n*(n-1)/2;

            numerator = (numerator*nChooseTwo%MOD)%MOD;
            long val2 = k*(k-1)/2;
            val2%=MOD;
            val2 = (val2*m)%MOD;
            numerator = (numerator + val2)%MOD;

            long denominator = nChooseTwo*nChooseTwo;
            denominator = inv(denominator)%MOD;

            System.out.println(numerator + " " + denominator);
            System.out.println((numerator*denominator)%MOD);

        }
    }
    public static long inv(long x){
        if(x <= 1){
            return x;
        }
        return MOD - MOD / x * inv(MOD % x) % MOD;
    }
}
