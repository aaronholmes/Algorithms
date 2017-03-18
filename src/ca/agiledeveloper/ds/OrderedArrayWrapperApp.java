package ca.agiledeveloper.ds;

public class OrderedArrayWrapperApp {
	public static void main(String[] args) {
		int maxSize = 50;
		OrderedArrayWrapper arr = new OrderedArrayWrapper(maxSize);
		
		arr.insert(14);
		arr.insert(1);
		arr.insert(99);
		arr.insert(72);
		arr.insert(87);
		arr.insert(17);
		arr.insert(23);
		arr.insert(52);
		arr.insert(67);
		arr.insert(81);
		
		arr.display();
		
		int searchKey = 52;
		if(arr.find(searchKey) != arr.size())
			System.out.println("Found " + searchKey);
		else 
			System.out.println("Cannot find " + searchKey);
		
		searchKey = 98;
		if(arr.find(searchKey) != arr.size())
			System.out.println("Found " + searchKey);
		else 
			System.out.println("Cannot find " + searchKey);
		
		arr.delete(81);
		arr.delete(1);
		arr.delete(67);
		arr.delete(14);
		arr.delete(17);
		arr.delete(99);
		
		arr.display();
	}
}
