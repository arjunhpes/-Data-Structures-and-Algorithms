package DP;

import java.util.Set;
import java.util.HashSet;
 
public class subArrayZeroSum
{
    public static Boolean hasZeroSumSubarray(int[] A)
    {
        Set<Integer> set = new HashSet<>();
        set.add(0);
 
        int sum = 0;
        for (int value: A)
        {
            // sum of elements so far
            sum += value;
 
            // if the sum is seen before, we have found a subarray with zero-sum
            if (set.contains(sum)) {
                return true;
            }
 
            // insert sum so far into the set
            set.add(sum);
        }
        // we reach here when no subarray with zero-sum exists
        return false;
    }
 
    public static void main (String[] args)
    {
        int[] A = { 4, -6, 3, -1, 4, 2, 7 };
 
        if (hasZeroSumSubarray(A)) {
            System.out.println("Subarray exists");
        }
        else {
            System.out.println("Subarray does not exist");
        }
    }
}