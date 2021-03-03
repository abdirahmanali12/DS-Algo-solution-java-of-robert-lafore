import java.util.*;

public class HighArrayApp {

	public static void main(String [] args){
	
		int maxSize = (Integer.MAX_VALUE/12)+10574179;
		HighArray arr = new HighArray(maxSize); // create the array
		arr.insertMany(maxSize-1);
		
		System.out.print("Enter the number your searching: " );
		
		long search = new Scanner(System.in).nextLong();
	
	
		
		
		System.out.println("result is index of : "+arr.findByBinary(search));

		System.out.println("result is index of : "+arr.findByLinear(search));	



	
	}
	
	
	
	
	
	



}
