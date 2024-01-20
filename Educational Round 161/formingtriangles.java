//Sohom Dutta, Codeforces Educational Round 160 B
import java.util.*;
public class formingtriangles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 0; testCase < t; testCase++){
            int n = sc.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            HashMap<Integer, Long> map = new HashMap<Integer, Long>();
            for(int i = 0; i < n; i++){
                if(map.containsKey(a[i])){
                    long x = map.get(a[i]);
                    map.put(a[i], x + 1);
                }else{
                    map.put(a[i], 1L);
                }
            }

            long count = 0;
            int previous = -1;
            long previousCount = -1;
            for(Map.Entry<Integer, Long> entry : map.entrySet()){
                int power = entry.getKey();
                long val = entry.getValue();

                if(val>=3){
                    count += (val)*(val-1)*(val-2)/6;
                }
                if(previous==-1){
                    previous = power;
                    previousCount = val;
                    continue;
                }

                if(val >= 2){
                    count += previousCount * val * (val - 1) / 2;
                }
                previous = power;
                previousCount += val;

            }
            System.out.println(count);

        }
    }
}
