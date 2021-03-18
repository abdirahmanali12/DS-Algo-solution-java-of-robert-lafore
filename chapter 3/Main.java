

public class Main{

	public static void main(String [] args){
	
		//var bs = new BubbleSorting(9);
		
	/*	bs.insert(3);
		bs.insert(5);
		bs.insert(2);
		bs.insert(6);
		bs.insert(1);
		bs.insert(4);
		bs.insert(8);
		bs.insert(9);
		bs.insert(7);

	*/
		//bs.display();
		
		//bs.biDirectionalBubbleSort();
		
		//bs.display();
				
				
	
		var bs =new BubbleSorting(9);
		
		
		
		bs.insert(5);
		bs.insert(8);
		bs.insert(3);
		bs.insert(2);
		bs.insert(-1);
		bs.insert(9);
		bs.insert(1);
		bs.insert(6);
		bs.insert(4);

		
		bs.display();
		bs.oddEvenSort();
		bs.display();	
		
		
		
	
	}


}
