import java.util.LinkedList;


class racecondition  implements Runnable{
   
	private int num = 0;

    public void plus() {
    
    	try {
            Thread.sleep(10);
        }
    	catch (InterruptedException e) {
           
            e.printStackTrace();
        }
    	num++;
    }

    public void mins() {    
    	num--;
    }

    public int getValue() {
        return num;
    }
    
    @Override
    public void run() {
     
        this.plus();
       
        System.out.println(Thread.currentThread().getName() + " " + this.getValue());
  
        this.mins();
     
        System.out.println(Thread.currentThread().getName() + " " + this.getValue());        
    }
    
    
}


class Util 
{ 
   
    static void sleep(long millis) 
    { 
        try
        { 
            Thread.sleep(millis); 
        } 
        catch (InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 
  

class cl { 
    
    synchronized void test1(cl s2) 
    { 
        System.out.println("#1_Starting"); 
       
        Util.sleep(100); 
  
        s2.test2(this); 
      
        System.out.println("#1_Ending"); 
    } 
  
   
    synchronized void test2(cl s1) 
    { 
        System.out.println("#2_Starting"); 
      
        Util.sleep(100); 
        
        s1.test1(this); 
      
        System.out.println("#2_Ending"); 
    } 
} 
  
  
class thf extends Thread 
{ 
    private cl s1; 
  
    private cl s2; 
  
    public thf(cl s1, cl s2) 
    { 
        this.s1 = s1; 
      
        this.s2 = s2; 
    } 
  
    @Override
    public void run() 
    { 
        s1.test1(s2); 
    } 
} 
  
  
class ths extends Thread 
{ 
    private cl s1; 
   
    private cl s2; 
 
    public ths(cl s1, cl s2) 
    { 
        this.s1 = s1; 
     
        this.s2 = s2; 
    } 
  
   
    @Override
    public void run() 
    { 
        s2.test2(s1); 
    } 
} 



public class task {
	

	private static class Reader implements Runnable {
	 
		LinkedList<dus> queue = null;
	    
	    public Reader(LinkedList<dus> queue) {
	 
	    	this.queue = queue;
	    }
	    
	    public void run() {
	   
	    	while (true) {
	    
	    		synchronized (queue) {
	     
	    			System.out.format("Checking elements   ", Thread.currentThread().getName() );
	      
	    			try {
	        
	    				if (queue.size() > 0) {
	          
	    					dus eq = queue.remove(0);
	          
	    					tas(eq);
	           
	    					queue.wait(200);
	            }
	            Thread.sleep(1000);
	       
	            queue.notify();
	          } 
	    			catch (InterruptedException e) {
	            
	    				System.out.format("%s interper\n", Thread.currentThread().getName());
	            
	    				e.printStackTrace();
	          }
	        
	    		}
	    		
	      }
	    	
	    }
	    
	    private void tas(dus eq) {
	      
	    	double val = 0;
	      
	      try {
	     
	    	  val = (eq.getDividend() / eq.getbolu());
	        
	    	  System.out.format(Thread.currentThread().getName(), eq.getDividend(), eq.getbolu(), val);
	      } 
	      catch (ArithmeticException ex) {
	      
	    	  ex.printStackTrace();

	        queue.addFirst(eq);
	      }
	      
	    }
	    
	  }
	  
	  private static class dus {
	 
		  private int dividend;
	    
		  private int bolu;
	    
	    public dus(int dividend, int bolu) {
	   
	    	setDividend(dividend);
	      
	    	setbolu(bolu);
	    }
	    
	    public int getDividend() {
	      return dividend;
	    }
	    
	    public void setDividend(int dividend) {
	      this.dividend = dividend;
	    }
	    
	    public int getbolu() {
	      return bolu;
	    }
	    
	    public void setbolu(int bolu) {
	      this.bolu = bolu;
	    }
	    
	  }

	public static void main(String[] args) {
		
		racecondition counter = new racecondition();
      
		Thread t1 = new Thread(counter, "#1");
        
		Thread t2 = new Thread(counter, "#2");
        
		Thread t3 = new Thread(counter, "#3");
        
		t1.start();
        
		t2.start();
        
		t3.start();
		
		System.out.println("\n\n");
		
		cl s1 = new cl(); 
		  
		cl s2 = new cl(); 
	  
	    thf q1 = new thf(s1, s2); 
	       
	    q1.start(); 
	  
	    ths q2 = new ths(s1, s2); 
	        
	    q2.start(); 
	  
	    Util.sleep(100); 
	    
	    LinkedList<dus> queue = new LinkedList<dus>();
	    
	         
	    Thread g1 = new Thread(new Reader(queue), "#1");
	  
	    Thread g2 = new Thread(new Reader(queue), "#2");
	  
	    Thread g3 = new Thread(new Reader(queue), "#3");
	   
	    Thread g4 = new Thread(new Reader(queue), "#4");
	  
	    Thread g5 = new Thread(new Reader(queue), "#5");
	  
	    g1.start();
	   
	    g2.start();
	   
	    g3.start();   
	  
	    
	   queue.add(new dus(10,5));
	    
	   queue.add(new dus(10,6));
	    
	   queue.add(new dus(11,3));
	    
	   queue.add(new dus(14,6));
	    

	}
}
