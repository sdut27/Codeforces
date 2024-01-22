//Sohom Dutta, Codeforces Educational Round 160 C
import java.util.*;
public class closestcities {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 0; testCase < t; testCase++){
            int n = sc.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            boolean [] toRight = new boolean[n];
            boolean [] toLeft = new boolean[n];
            toRight[0] = true;
            toLeft[n-1] = true;
            for(int i = 1; i < n - 1; i++){
                if(Math.abs(a[i+1]-a[i]) < Math.abs(a[i-1]-a[i])){
                    toRight[i] = true;
                }
            }
            for(int i = n - 2; i >= 1; i--){
                if(Math.abs(a[i+1]-a[i]) > Math.abs(a[i-1]-a[i])){
                    toLeft[i] = true;
                }
            }

            long [] costForward = new long[n];
            for(int i = 1; i < n; i++){
                if(toRight[i-1]){
                    costForward[i] = 1 + costForward[i-1];
                }else{
                    costForward[i] = Math.abs(a[i]-a[i-1]) + costForward[i-1];
                }
            }

            long [] costBackward = new long[n];
            for(int i = n-2; i >= 0; i--){
                if(toLeft[i+1]){
                    costBackward[i] = 1 + costBackward[i+1];
                }else{
                    costBackward[i] = Math.abs(a[i]-a[i+1]) + costBackward[i+1];
                }
            }

            //System.out.println(Arrays.toString(cost));
            int m = sc.nextInt();
            for(int i = 0; i < m; i++){
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                if(x < y){
                    System.out.println(costForward[y] - costForward[x]);
                }else{
                    System.out.println(costBackward[y] - costBackward[x]);
                }

            }

        }
    }
}
