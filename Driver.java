import java.util.*;

public class Driver {

   public static void main (String[] args) {
   	Scanner sc = new Scanner(System.in);
   	System.out.print ("Enter Number = ");
   	
   	int a = sc.nextInt();
   	
   	try{
   		try {
    			if(a>100){
    				throw new OverFlowException("Greater than 100");
    			}
    			if(a<0){
    			throw new UnderFlowException("Less than 0");
    			}
    			System.out.println ("Correct Value");
			}
		catch (OverFlowException ex) {
			System.out.println (ex.getMessage());
			throw ex;
		}		
		catch (UnderFlowException ex) {
			System.out.println (ex.getMessage());
			
		}
   	}
   	catch (Exception e){
   		System.out.println ("Exception Occurred");
   	}	
}
      
}