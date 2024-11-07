package Assignment6;

import java.util.*;

public class Exercise1 
{
    public static void main( String[] args ) 
    {
        Scanner sc = new Scanner( System.in );
        System.out.print("How many number in array: ");
        int num = sc.nextInt();
        
        int[] arr = new int[num];
        
        for ( int i = 0; i < num; i++ )
        {
            System.out.print("Number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for ( int i = 1; i < num; i++ )
        {
            if ( arr[i] > max )
            {
                max = arr[i];
            }
            if ( arr[i] < min )
            {
                min = arr[i];
            }
        }
        
        System.out.println("The largest elements: " + max );
        System.out.print("The smallest elements: " + min );
    }
    
}
