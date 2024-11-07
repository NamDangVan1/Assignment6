package Assignment6;

import java.util.*;

public class Exercise3 
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
        
        System.out.print("A specific integer: ");
        int spI = sc.nextInt();
        
        int count = 0;
        
        for ( int i = 0; i < num; i++ )
        {
            if ( spI == arr[i] )
            {
                count++;
            }
        }
        
        System.out.println("that integer appears " + count + " times in the array.");
        
    }
}
