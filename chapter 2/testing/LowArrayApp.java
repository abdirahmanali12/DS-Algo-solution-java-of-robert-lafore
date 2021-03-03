public class LowArrayApp{

	public static void main(String [] args){
	
		LowArray  arr = new LowArray(100);
	
		int nElem = 0;
		int j = 0;

						
		arr.setElem(0,54); // inserting elements into the array		
		arr.setElem(1,77);
		arr.setElem(2,99);
		arr.setElem(3,44);
		arr.setElem(4,55);
		arr.setElem(5,22);
		arr.setElem(6,88);
		arr.setElem(7,11);
		arr.setElem(8,00);
		arr.setElem(9,66);

		nElem = 10;
		
		
		
		for (;j<nElem;j++) // displaying itmes
			System.out.print(arr.getElem(j)+"\t");

		System.out.println();
		System.out.println("Done......");


		int searchKey = 26;
		for(j=0;j<nElem;j++)
			if(arr.getElem(j) == searchKey) // searching element
				break;

		if(j == nElem)
			System.out.println("Element is not available.");
		else
			System.out.println("Element is found " + searchKey);



		for(j = 0; j <nElem; j++)
			if(arr.getElem(j)== 55)break;


		for(int k = j; k<nElem; k++) // deleting the element.
			arr.setElem(k,arr.getElem(k+1));
		
		
		for(j = 0; j<nElem;j++)
			System.out.print(arr.getElem(j)+"\t");
			
		System.out.println();
		System.out.println("Done .....");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		












	
	
	}

}
