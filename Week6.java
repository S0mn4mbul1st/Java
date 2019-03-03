package week6;


public class Week6 {
   
    public enum Products
    {
        
          ITEM1, ITEM2, ITEM3;
          Products type; 
          String  comment ;
          double price, weight; 
          int quantity;
          
        public void Item(Products product , double weight , double price ,String comment)
        {
           
            this.type = product; 
            this.weight = weight; 
            this.price = price; 
            this.comment = comment; 
            
        }
        
        public void add( int quantity )
        {
            this.quantity =  quantity ; 
        }
        
        public boolean remove ( int number ) 
        {
            
            if ( quantity != number )
                
                return false ;

            return true ;             
            
        }
        
        public int getQuantity()
        {
           return this.quantity;  
        }
        
        public String toString()
        {
            
            return this.comment; 
            
        }
        
    }
   
    public static void main(String[] args) 
    {
       Products a = Products.ITEM1;
       a.Item(Products.ITEM1 ,0.5,12.3,"my personal choice"); 
       Products b = Products.ITEM2; 
       Products c = Products.ITEM3; 
       
       a.add(5);
       c.remove(5);
       b.getQuantity();
       c.toString(); 
       
       System.out.print( "adding,should be 3 is : " + a.getQuantity() +"\n");
       System.out.print("removing,should be false, is:"+ a.remove(10) +"\n");
    }
    
}
