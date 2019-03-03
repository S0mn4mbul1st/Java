 package numberswords;

import java.util.Scanner ; 
import java.util.*;

public class NumbersWords 
{
 
    
    public static Vector<Integer> readIntegers ( Scanner scIn )
    {
        System.out.println("Enter numbers : ");
        
        Vector<Integer> result = new Vector<Integer>();
        
        while (scIn.hasNextInt())
        {
            
          Integer number = scIn.nextInt() ; 
          
          result.add ( number ) ;
            
        }
        return (result) ; 
    }
    
    public static Vector <String> readWords (Scanner scIn )
    {
        
        Vector <String> result = new Vector <String> () ; 
       
        System.out.println( "Enter Words : ");
        
        while ( scIn.hasNext() )
        {
            
            String word = scIn.next() ; 
            
            if ( word.toLowerCase().equals("exit")) break ; 
          
              result.add(word) ;   
        }
        return (result) ; 
    }
    
    public static Vector <Integer> readIntegers()
    {
        
        Scanner sc = new Scanner (System.in) ; 
        
        return (readIntegers(sc)) ;
    
    }

     public static Vector <String> readWords()
    {
        Scanner sc = new Scanner(System.in); 
        
        return (readWords(sc)) ;
    
    }
     
     public static Vector <String> readWords2()
     {
      Scanner sc = new Scanner(System.in).useDelimiter("\\n"); 
        
        return (readWords(sc)) ;
     }
     

     
    public static void showMaxValue (Vector <Integer> v)
    {
        
        Integer max=Integer.MIN_VALUE;
        
        System.out.println(max);
  
    }

    public static void showNumbers (Vector<Integer> v)
    {
        
        Integer size = v.size();
        
        for ( Integer k = 0 ; k < size ; k ++ )
            
            System.out.println(v.elementAt(k));
    
        System.out.println("\n") ; 
    }
    
    public static   Vector < Integer > vInt1 = readIntegers(); 
 
    public static   Vector < String > Word = readWords(); 
    
    public static   Vector < String > Word2 = readWords2(); 
    
    public static void main(String[] args) 
    {

        showNumbers ( vInt1 ) ; 
        
         Scanner sc = new Scanner ( System.in ) ; 
        
         System.out.println( "Enter Limit of numbers : " ) ; 
         
         Integer limitt = sc.nextInt(); 
         
       Integer[] arr = getGreaterThan (limitt) ; 
        
         System.out.println("\n" + "GreaterThan  = " + Arrays.toString(arr) + "\n" ) ;
                 
         printLargers(vInt1.size(), vInt1) ; 
         
         printPalindromes (Word) ;   
         
         printAllLinesWith (Word2);
         
    }
    
    public static Integer[] getGreaterThan (Integer limit)
    {
                
        Integer[] resultt = null;
        
        int t = 0 ; 

             
        resultt = new Integer[vInt1.size()];
        
       for ( int i = 0 ; i < vInt1.size() ; i ++ )
       {
       
         if ( vInt1.elementAt(i) > limit ) 
         {
             resultt[t] =  vInt1.elementAt(i) ; 
         
             t ++ ; 
         }   
           
       }
        Integer[] result = Arrays.copyOf(resultt, t);
        
        return (result) ; 
        
    }
    
    public static void printLargers(int howMany, Vector<Integer>numbers)
    {
         Integer max = Integer.MIN_VALUE , ans = 0 ; 
         
         for ( Integer i = 0 ; i < howMany ; i ++ )
         {   
             if ( numbers.elementAt(i) > max ) 
                 
                 max = numbers.elementAt(i) ;    
         }
        
          for ( Integer i = 0 ; i < howMany ; i ++ )
         {   
             if ( numbers.elementAt(i) == max ) 
                 
                 ans ++ ;   
         }
          
          System.out.println("Count of maximum numbers (" + max + ") : " + ans + "\n");
    }
                
    public static void printPalindromes (Vector <String> words)
    {
       
        for ( int x = 0 ; x < words.size()  ; x ++ )
        {  	
          String original, reverse = ""; 
   
          original = words.elementAt(x); 
     
         int length = original.length();
     
        for (int i = length - 1; i >= 0; i--)
         
         reverse = reverse + original.charAt(i);
     
      
      if (original.equals(reverse))
       
         System.out.println("The "  + words.elementAt(x)  + " is a palindrome.");
     
      
      else
      
         System.out.println("The " + words.elementAt(x) + " isn't a palindrome.");
        }
        
         
   }
        

     
    public static void printAllLinesWith (Vector <String> wordsIneed)
    {
        
        Scanner cin = new Scanner (System.in) ; 
        
        System.out.println("Enter key word :");
        
        Vector <String> needle = new Vector<String>();
        
     while ( cin.hasNext() )
        {
            
            String wor = cin.next() ; 
            
            if ( wor.toLowerCase().equals("exit")) break ; 
          
              needle.add(wor) ;   
        }
       
         
        
        for ( int i = 0 ; i < wordsIneed.size() ; i ++)
        {
         int countt = 0;
         
            for(int j=0;j<needle.size();j++)
            { 
                if (wordsIneed.elementAt(i).indexOf(needle.elementAt(j)) != -1 )
        {
            countt++;
                
               }
        if(countt==needle.size())
        {
            System.out.println( wordsIneed.elementAt(i));
                    
        }
     
          
        }
    }
}
