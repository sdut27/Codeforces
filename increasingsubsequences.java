import java.util.*;
//Sohom Dutta, Codeforces Educational Round 160 E
public class increasingsubsequences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 0; testCase < t; testCase++){
            long n = sc.nextLong();
            ArrayList<Integer> ans = new ArrayList<Integer>();
            String s = Long.toBinaryString(n);
            String reversedS = "";
            for(int i = 0; i < s.length(); i++){
                reversedS = s.substring(i, i+1) + reversedS;
            }

            int len = reversedS.length();
            boolean firstNotFound = true;
            for(int i = len-1; i >= 0; i--){
                if(reversedS.charAt(i)=='1'){
                    if(firstNotFound){
                        for(int j = 1; j <= i; j++){
                            ans.add(j);
                        }
                        firstNotFound = false;
                    }else{
                        ans.add(i+1);
                    }

                }
                if(ans.size() > 200){
                    break;
                }
            }
            if(ans.size() > 200){
                System.out.println(-1);
            }else{
                System.out.println(ans.size());
                for(int i = 0; i < ans.size(); i++){
                    System.out.print(ans.get(i) + " ");
                }
                System.out.println();
            }

        }
    }

}
