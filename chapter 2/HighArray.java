
import java.util.*;
public class HighArray{

	private long a [];
	private int nElem;
	
	
	public HighArray(int max){
		a = new long[max];
		nElem = 0;
	}

	public int size(){
		return nElem;
	}
		

	
	public int findByBinary(long searchKey){
		
		int lowerBound = 0;
		int upperBound = nElem -1;
		int current = 0;
		while(lowerBound <= upperBound){
			current = (lowerBound + upperBound ) / 2;
			if(a[current] == searchKey)
				return current;
			
			else
				if(a[current] < searchKey)
					lowerBound = current + 1;
				else
					upperBound = current - 1;		
		}
					
		
		return -1;
	}
	
	
	public void insert(long value){
		
		a[nElem] = value;
		
		nElem++;	
	}
	

	
	
	public boolean delete(long value){

		int j = 0;
		for( ; j < nElem; j++)
			if(a[j] == value)break;
			
		if(j == nElem)
			return false;	
		else
			while(j < nElem){
				a[j] = a[j];
				j++;
			
			}
		nElem--;
	
		return true;
	}
	
	
	
	

	public void display(){
		for(int j = 0; j<nElem; j++)
			System.out.print(a[j]+" \t");
		
	}
	
	/* ------- programming projects----------*/
	
	// 2.1
	public long getMax(){
		if(nElem == 0)
		 	return -1; 
		/* use this when the array is sorted, time complexity will be O(1). asc return a[nElem-1]; desc return a[0]; */  
		
		// unsorted array is O(N)
		long max = a[0];
		
		for (int i = 1; i < nElem; i++)
			if(max < a[i])
				max = a[i];
			
		return max;
	}
	
	// 2.2
	public long removeMax(){
		// O(N)
		long max = getMax();
		delete(max);
		return max;
	}
	
	
	
	// 2.6
	public void noDup(){
		long value = 0;

		for(int i=0; i<nElem; i++) {
			value = a[i];
			for(int j=i+1; j<nElem; j++) {
				if(a[j] == value) {
					for(int k=j; k<nElem-1; k++) {
						a[k] = a[k+1];
					}
					nElem--;
					j--;
				}
			}
		}
	}	
	

	
	
}
