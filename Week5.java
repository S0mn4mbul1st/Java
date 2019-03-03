package week5;

import java.io.*; 
import java.util.*; 

public class Week5 {

    public static int[][] createRectArray(int rowNo , int colNo )
    {
        
        int[][] arr = new int[rowNo][colNo] ; 
        
        return arr ; 
        
    }
    
     public static int[][] createTriangleArray(int rowNo )
     { 
         int[][] tri = new int[rowNo][];
         int c = 1; 
   
         for (int i = 0; i < rowNo; i++){
       
              for (int j = 0; j <= i; j++){
       
                  tri[i] = new int[i+1]; 
            
                  tri[i][j] = c;
          
            c++; 
        }
        
    }
    
    return tri;
     }
     
     public static int calcFibonacci(int n)
     {
         
       int x1 = 0 , x2 = 1 , x3 =0;

        if (n == 0)    return x1;

        else if (n == 1) return x2;
        
        else

            for (int i = 1; i < n; i ++)
                {
                    x3 = x1 + x2;
                    x1 = x2;
                    x2 = x3;
                }
                return x3;
     }
    
     public static void printMatrix(int mat[][]) 
    { 
       
        for (int[] row : mat) 
  
            System.out.println(Arrays.toString(row)); 
        
         System.out.println ("\n") ;
    } 
     
    
     public static int lookup(int[][] data, int val)
     {
         int ans = 0 ;
         
         for (int i = 0 ; i < data.length; i ++ )
             for( int j = 0 ; j < data[0].length; j ++)
             {
             if (data[i][j] == val) {ans ++ ;}
             
             }
         return ans; 
     }
     
     public static void main(String[] args) 
    {
        int[][] a , b;
        
        a = createRectArray(3,4) ; 
        
        b = createTriangleArray(4) ;
        
        fillWithFibonaccci(a) ;  
        fillWithFibonaccci(b) ; 
        
        int c = calcFibonacci(8) , d = lookup ( a , 1);
        
        
        System.out.println ("Fibonacci = " + c + "\nLookUp = " + d); 
        
        System.out.println ("GON : " + getGreatesOdd(a)) ; 
        
    }
     
    static void fillWithFibonaccci(int[][] rt)
     {
         int t = 0 ;
         
         for(int i = 0 ; i < rt.length; i ++ )
             for ( int j = 0 ; j < rt[i].length ; j ++ )
                 
             { rt[i][j] = calcFibonacci(t+1) ; t ++ ; } 
         
          printMatrix(rt);
     }
 
    
    static int getGreatesOdd(int[][] arr)
    {
        
        int ans = Integer.MIN_VALUE ; 
        
          for(int i = 0 ; i < arr.length; i ++ )
             for ( int j = 0 ; j < arr[0].length ; j ++ )
             {
                 if (arr[i][j] % 2 == 1) 
                     if (arr[i][j] > ans) ans = arr[i][j] ; 
                 
             }
        
        return ans ; 
    }
}
