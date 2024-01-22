import java.util.*;
public class floornumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 0; testCase < t; testCase++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n <= 2){
                System.out.println(1);
            }else{
                int floorNumbers = 2 + (n - 3) / x;
                System.out.println(floorNumbers);
            }
        }
    }
}
