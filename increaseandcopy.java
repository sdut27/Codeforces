import java.util.*;
public class increaseandcopy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 0; testCase < t; testCase++){
            int n = sc.nextInt();
            int highestPossible = (int) (Math.sqrt(n) + 1);

            long minMoves = Long.MAX_VALUE;
            for(int i = Math.max(highestPossible - 100, 1); i <= highestPossible; i++){
                long movesNeeded = (i-1) + (long) (Math.ceil(n - 1) / i);
                minMoves = Math.min(minMoves, movesNeeded);
            }
            System.out.println(minMoves);

        }
    }
}
