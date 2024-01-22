import java.util.*;
public class nonzerosegments {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        HashSet<Long> set = new HashSet<Long>();
        set.add(0L);
        long runningSum = 0;
        long count = 0;
        for(int i = 0; i < n; i++){
            runningSum += array[i];
            if(set.contains(runningSum)){
                count++;
                set = new HashSet<Long>();
                runningSum = array[i];
                set.add((long) array[i]);
                set.add(0L);
            }else{
                set.add(runningSum);
            }

        }
        System.out.println(count);
    }
}
