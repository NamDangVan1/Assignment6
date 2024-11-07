package Assignment6;

import java.util.*;

public class Exercise2 
{
    public static void main( String[] args ) 
    {
        Scanner sc = new Scanner( System.in );
        
        System.out.print("How many number in array: ");
        int num = sc.nextInt();
        
        int[] arr = new int[num];
        int sum = 0;
        
        for ( int i = 0; i < num; i++ )
        {
            System.out.print("Number " + ( i + 1 ) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        double average = ( double ) sum / num;
        
        System.out.println("Sum: " + sum );
        System.out.printf("Average: %.1f", average );
        
    }
}
