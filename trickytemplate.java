//Sohom Dutta, Codeforces Educational Round 160 A
import java.util.*;
public class trickytemplate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 0; testCase < t; testCase++){
            boolean possible = true;
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            int cMismatch = 0;
            for(int i = 0; i < n; i++){
                //System.out.println(a.charAt(i) + " " + b.charAt(i) + " " + c.charAt(i));
                if(a.charAt(i) == b.charAt(i) && a.charAt(i) != c.charAt(i)){
                    cMismatch++;
                    continue;
                }
                if(a.charAt(i) != c.charAt(i) && b.charAt(i) != c.charAt(i)){
                    //System.out.println(a.charAt(i) + " " + b.charAt(i) + " " + c.charAt(i));
                    cMismatch++;
                    continue;
                }
            }

            possible = cMismatch >= 1;

            if(possible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
