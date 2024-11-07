package Assignment6;

import java.util.*;

public class Exercise4 
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
        
        for ( int i = 0; i < num-1; i++ )
        {
            for ( int j = i+1; j < num; j++ )
            {
                if ( arr[j] < arr[i] )
                {
                    int n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }
        }
        
        System.out.print("Array: ");
        
        for ( int i = 0; i < num-1; i++)
        {
            System.out.print( arr[i] + ", ");
        }
        System.out.println( arr[num-1] + ".");
        
    }
}
