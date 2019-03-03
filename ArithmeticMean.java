package arithmeticmean;

import java.util.Scanner;

public class ArithmeticMean
{

   
    public static void main(String[] args) 
    {
        // TODO code application logic here
       
        int sum = 0 , elemNo = 0 , currElem ; 
        
        double result; 
        
        int max = Integer.MIN_VALUE ; 
        int min = Integer.MAX_VALUE ; 
       
        Scanner sc=new Scanner ( System.in ) ; 
        
        while ( sc . hasNextInt() )
        {
            
            currElem = sc.nextInt() ; 
            
            if ( currElem > max ) max = currElem ;
            if ( currElem < min ) min = currElem ;
            
            sum += currElem ;
            
            elemNo++ ; 
            
        }
        
        System.out.println ( "Sum =" + sum + "\n") ;
          
        System.out.println ( "Mid-Range = " + ( max + min ) / 2 + "\n" );
        
        
        if ( elemNo == 0 )
        {
            
            System.err.print ( "No data available/n" ) ; 
            System.exit(1) ; 
        }
        
        sc.close();
        
        result = (double) sum / elemNo ; 
        
        System.out.print("the sum of " + elemNo );
        System.out.print(" is " + result + "\n" );
        System.exit(0) ;    
        
    }
   
}
