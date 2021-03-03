import java.util.*;

public class Main {

	public static void main(String [] args){
	
	
		var arr = new HighArray(8); // create the array
		
		arr.insert(2);
		arr.insert(3);
		arr.insert(5);
		arr.insert(8);
		arr.insert(4);
		arr.insert(3);
		arr.insert(2);
		arr.insert(5);
		
		
		arr.noDup();
		
		arr.display();
			
		/*	
		// sorting suggested by removeMax method 
		// second array 2.3
	
		int size =arr.size();
		var arr2 = new HighArray(size);
		for (int i = 0; i < size ; i++)
			arr2.insert(arr.removeMax());
			
		
		
		
		// 2.4
		var oArr = new OrderedArray(5);
		oArr.insert(-44);
		oArr.insert(-4);
		oArr.insert(1);
		oArr.insert(4);
		oArr.insert(5);
		*/
		// System.out.println(oArr.find(-4));
		
		
		
		var a = new OrderedArray(6);
		a.insert(3);
		a.insert(2);
		a.insert(4);
		a.insert(8);
		a.insert(6);
		a.insert(5);
		
		
		var b = new OrderedArray(6);
		b.insert(3);
		b.insert(8);
		b.insert(2);
		b.insert(3);
		b.insert(5);
		b.insert(8);

		
		var c = OrderedArray.marge(a,b);
		
		//c.display();
		System.out.println();
		
		
		
		
		
		
	}

}
