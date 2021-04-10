package Imp;

public class trailingZeros {
	 
    public static void main(String[] args)
    {
       
        int countFactorialTrailingZeros = countFactorialTrailingZeros(5);
 
        System.out.println(countFactorialTrailingZeros);
    }
 
    public static int countFactorialTrailingZeros(int num)
    {
        int countOfZeros=0;
        for(int i=2;i<=num;i++)
        {
            countOfZeros+=countFactorsOf5(i);
        }
        return countOfZeros;
    }
 
    public static int countFactorsOf5(int i)
    {
        int count=0;
        while(i%5==0)
        {
            count++;
            i/=5;
        }
        return count;
    }
}