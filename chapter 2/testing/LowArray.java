public class LowArray{

	private int [] a;
	
	
	public LowArray(int size){
		this.a = new int[size];
	}
	
	
	public void setElem(int index, int element){
		a[index] = element;
	}
	
	public int getElem(int index){
		return a[index];
	}

}
