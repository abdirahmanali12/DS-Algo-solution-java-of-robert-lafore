public class OrderedArray {
	
	private  long a [];
	private int nElem ;
	
	public OrderedArray(int max){
		a = new long[max];
		nElem = 0;
	}
	
	public void insert(long value){
		a[nElem] = value;
		nElem++;
	}
	
	public int size(){
		return nElem;
	}
	
	public boolean delete(long value){
		if(nElem == 0)
			return false;
		
		int i = 0;
		for( ; i < nElem; i++)
			if(a[i] == value)
				break;
	
		if(i == nElem)
			return false;
		else
			while (i < nElem){
			
				a[i] = a[i+1];
				i++;
			}
		
		nElem--;
		return true;
	}
	
	
	public int find(long searchKey){
	
		int start = 0;
		int end = nElem-1;
		int middle = 0; 
		
		while(start <= end){
			middle = (start + end) / 2;
			if(a[middle] == searchKey)
				return middle;
			else 
				if(a[middle] < searchKey)
					start = middle +1;
				else
					end = middle -1;		
		}
	
		return -1;
	
	
	}
	
	
	public long getElem(int index){
		return a[index];
	}
	
	
	
	// 2.5
	
	public static OrderedArray marge(OrderedArray or1, OrderedArray or2){
		int size = or1.size()+or2.size();
		var marged = new OrderedArray(size);
		
		int j = 0, k = 0;
		
		// approach two
		while(j < or1.size() || k< or2.size())
			if(j<or1.size())
				if(or1.getElem(j) <= or2.getElem(k)){
					marged.insert(or1.getElem(j));
					j++;
				}
				else{
					marged.insert(or2.getElem(k));
					k++;
				}
			else {
					marged.insert(or2.getElem(k));
					k++;
			    }	
	
		return marged;
	
	
	}
	
	
	



	public void display(){
		for(int j = 0; j<nElem; j++)
			System.out.print(a[j]+" \t");
		
	}
	





}
