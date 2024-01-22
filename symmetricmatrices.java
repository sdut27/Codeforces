import java.util.*;
public class symmetricmatrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 0; testCase < t; testCase++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            //System.out.println(n + " " + m);
            boolean containsSymmetric = false;
            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                if(b == c){
                    containsSymmetric = true;
                }
            }

            if(containsSymmetric&&(m%2==0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
