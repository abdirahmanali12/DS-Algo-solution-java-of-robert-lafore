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
		// 3.5
		int copy=0, comparisons=0;
	
		int in;
		for(int out = 1; out < nElem; out++){
			int temp = a[out];
			copy++;
			in = out;
			while(in > 0 && a[in-1] >= temp){
				comparisons++;
				a[in] = a[in-1];
				copy++;
				--in;
				
			}
			comparisons++;
			a[in] = temp;
			copy++;
		}
		
		System.out.println(copy+" of copies and "+comparisons+" of comparisons");
	}
	
	// 3.6
	public void noDupsSort() {
	
		int in,nDups=0;
		for(int out = 1; out < nElem; out++){
			int temp = a[out];
			in = out;
			while(in > 0 && a[in-1] >= temp){
				
				if (a[in-1] == temp) {
					temp = -1;
					nDups++;
				}

				
				a[in] = a[in-1];
				--in;
				
			}
			
			a[in] = temp;
			
		}
		
		
		nElem -= nDups;
		

	}
	
	
	
	
	// 3.2
	public int median() {
		
		insertionSort();

		int n = nElem;
 		
        if (n % 2 != 0)
        	return a[n / 2];
     
        return (a[(n - 1) / 2] + a[n / 2]) / 2;
	}			  



	// 3.3
	public void noDups(){
		insertionSort();
		boolean isHaveDuplicates = true;
		while(isHaveDuplicates){
		
			isHaveDuplicates = false;
			for(int i = 0; i < nElem; i++)
				if(a[i] == a[i+1]){
					replaceAll(i+1);
					isHaveDuplicates = true;
				}		
			
		}
				
	}
	
	
	private void replaceAll(int start){
	
		for(;start < nElem-1; start++){
			a[start] = a[start+1];
			a[start+1] = 0;	
		}
		
		a[start] = 0;
			
		nElem--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
}
