
package week7;

public class Test 
{
  
    public static void main(String[] args) 
    {
      
        Product it = new Product(Products.BREAD, 2, 1);
        Product it2 = new Product(Products.TEA, 4, 0.1);
        Product it3 = new Product(Products.MILK, 4, 3.5);
        Product it4 = new Product(Products.OTHER, 3, 4.6);
        Product it5 = new Product(Products.MILK, 4, 3.4);
        Product it6 = new Product(Products.BUTTER, 3, 777);
        Product[] its = {it, it2, it3, it4, it5, it6};
        
        SmallBag small = new SmallBag();
        
        BigBag big = new BigBag();
        
        System.out.println("Empty bags:");
        
        System.out.println(small.toString());
        
        System.out.println(big.toString());
        
        System.out.println("Added stuff to small:");
        
        small.putIn(it);
        
        small.putIn(it2);
        
        small.putIn(it3);
        
        System.out.println(small.toString());
        
        System.out.println("Array to small:");
        
        small.putIn(its);
        
        System.out.println(small.toString());
       
        System.out.println(small.toString());
        
        System.out.println("Removing bread:");
       
        small.removeProduct(Products.BREAD);
        
        System.out.println(small.toString());
        
        System.out.println("Array + 2 x tea to big:");
      
        big.putIn(its);
        big.putIn(it2);
        big.putIn(it2);
        
        System.out.println(big.toString());
       
        System.out.println("Multiple arrays to big:");
      
        for ( int i = 0 ; i < 5 ; i ++ )
        
        big.putIn(its);
       
        System.out.println(big.toString());
       
    }
}