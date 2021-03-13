import java.util.function.Consumer;


public class InsertionSorting{


	private int [] a;
	private int nElem;
	
	
	public InsertionSorting(int max){
		a = new int[max];
		nElem = 0;
	}
	
	
	
	
	public Consumer<Integer> insert = value -> { a[nElem] = value; nElem++; };
	
	
	

	public void display(){
		System.out.println(java.util.Arrays.toString(a));
	}




	
	public void insertionSort() {
		
		for(int i = 1; i<nElem; i++){
			int marker = a[i];
			int lastSpotIndex = i;
			for(int j = i; j > 0; j--)
				if(marker < a[j-1]){
					a[j] = a[j-1];
					lastSpotIndex = j-1;	
				}
						
			a[lastSpotIndex] = marker;

		}
	
	}
	
	// 3.2
	public int median() {
		
		insertionSort();

		int n = nElem;
 		
        if (n % 2 != 0)
        	return a[n / 2];
     
        return (a[(n - 1) / 2] + a[n / 2]) / 2;
	}			  

	
	


	
}
