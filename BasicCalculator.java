package abstractcalc;


public class BasicCalculator extends AbstractCalc {

    @Override
    public String calculate(String argument) {
        
        if ( argument == "+") return "Addition operation...";  
        else if ( argument == "-") return "Difference operation...";
        else  return "Product operation...";
           
    }

    @Override
    public int sum(int k1, int k2) {
       
       return k1 + k2 ; 
    }

    @Override
    public double sum(double k1, double k2) {
    return k1 + k2 ;   
    }

    @Override
    public String sum(String k1, String k2) {
return k1 + k2 ;   
    }

    @Override
    public int product(int k1, int k2) {
 return k1 * k2 ;  }

    @Override
    public double product(double k1, double k2) {
     return k1 * k2 ; }

    @Override
    public String product(String k1, String k2) {
      return k1 + k2 ; }

    @Override
    public int difference(int k1, int k2) {
         return k1 - k2 ; }

    @Override
    public double difference(double k1, double k2) {
      return k1 - k2 ;  }

    @Override
    public String difference(String k1, String k2) {
     return k1;  }
    
    
    
}
