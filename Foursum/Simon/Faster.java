import edu.princeton.cs.algs4.*;
import java.util.*;

public class Faster {
    public static void main(String[] args) {
        // For scanner method
        Scanner S= new Scanner(System.in);
        int N = Integer.parseInt(S.nextLine());
        long[] vals = new long[N];
        for(int i= 0; i < N; i+= 1) vals[i] = Long.parseLong(S.nextLine());
        
        // For directory method
        /* int N = Integer.parseInt(args[0]);
        long[] vals = new long[N];
        for(int i = 1; i < N; i+= 1) vals[i-1] = Long.parseLong(args[i]); */
        
        Arrays.sort(vals);

        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                     if (Arrays.binarySearch(vals, -(vals[i] + vals[j] + vals[k])) > k) {
                          System.out.println(true);
                          return;
                     }          
        System.out.println(false);
    }
}