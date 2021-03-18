import java.util.Arrays;
public class BubbleSorting{

	private int a [];
	private int nElem;
	
	
	public BubbleSorting(int max){
		a = new int[max];
		nElem = 0;
	}
	
	
	public void insert(int value){
		a[nElem] = value;
		nElem++;
	}
	
	
	public void display(){
		System.out.println(Arrays.toString(a));
	}
	
	
	public void bubbleSort(){
	     for(int i = nElem-1; i> 1; i--)
	          for(int j = 0; j<i; j++)
			if(a[j] > a[j+1])
	           	   swap(j,j+1);
	                   
																						
																					
	}
	
	
	// 3.1
	public void biDirectionalBubbleSort(){
	
		int in = 0, rOut = nElem-1, lOut = 0;
		
		boolean isSwap = true;
		
		while(isSwap){
		
		      isSwap = false;
			
			// in from left to right ->
			for(in = lOut; in < rOut; in++)
			      if(a[in] > a[in+1]){
			      	swap(in, in+1);
			      	isSwap = true;
			      }
							
			
			// in from right to left <-
			for(in = rOut-1; in > lOut; in--)
				if(a[in] < a[in-1])
				{
					swap(in,in-1);
					isSwap = true;
				} 
		
		
			rOut--;
			lOut++;
		
		}
		
		
	}
	
	
	private void swap(int a, int b){
		int temp = this.a[a];
		this.a[a] = this.a[b];
		this.a[b]= temp;
	}	
	

	// 3.4
	public void oddEvenSort(){
		boolean isSwapped = true;
		int index = 0;
		while(isSwapped){
			index = index % 2 == 0 ? 1:0;
			isSwapped = false;
			while(index < nElem-1){
				if(a[index] > a[index+1]){	
					swap(index, index+1);
					isSwapped = true;
				}		
				index +=2;
			}
		}
	}



}
