import java.time.*;
import java.time.temporal.*;
import java.util.*;
public class HighArray{

	private long a [];
	private int nElem;
	
	
	public HighArray(int max){
		a = new long[max];
		nElem = 0;
	}

		
	public int findByLinear(long searchKey){
		LocalTime t1 = LocalTime.now();
		System.out.println("------------------------Linear searching started------------------ at time : "+t1);
		int j = 0;
		int found = 0;
		for( ; j < nElem; j++)
			if(a[j] == searchKey)break;
	
		if(j == nElem)
			found = -1;
		else
		 	found = j;
		
		LocalTime t2 = LocalTime.now();
		System.out.println("------------------------Linear searching ended------------------ at time : "+t2);
		System.out.println("Consumed : " + t1.until(t2, ChronoUnit.MILLIS));
		return found;
	}
	
	
	
	public int findByBinary(long searchKey){
		LocalTime t1 = LocalTime.now();
		System.out.println("------------------------Binary searching started------------------ at time : "+t1);
		int lowerBound = 0;
		int upperBound = nElem -1;
		int current = 0;
		int found = 0;
		while(true){
			current = (lowerBound + upperBound ) / 2;
			if(lowerBound > upperBound){
				found = -1;
				break;
			}
			else if(a[current] == searchKey){
				found = current;
				break;			
			}
			
			else
				if(a[current] < searchKey)
					lowerBound = current + 1;
				else
					upperBound = current - 1;		
		
		}
					
		LocalTime t2 = LocalTime.now();
		System.out.println("------------------------Binary searching ended------------------ at time : "+t2);
		System.out.println("Consumed : " + t1.until(t2, ChronoUnit.MILLIS));
		
		
		return found;
	}
	
	
	public void insert(long value){
		
		a[nElem] = value;
		
		nElem++;	
	}
	
	
	public void insertMany(int max){
		Random rand = new Random();
		for(int i = 1; i<max; i++)
			insert((long) rand.nextInt(max) ); 
	}
	
	
	public boolean delete(long value){
		
		int j = 0;
		for( ; j < nElem; j++)
			if(a[j] == value)break;
			
		if(j == nElem)
			return false;	
		else
			for(int k = j; k < nElem; k++)
				a[k] = a[k+1];
		nElem--;
	
		return true;
	}

	public void display(){
		for(int j = 0; j<nElem; j++)
			System.out.print(a[j]+" \t");
		System.out.println("");
		System.out.println("------------------done-------------------");
	}

}
