package ca.agiledeveloper.algorithms;

public class Runner {
	public static void main(String trav[]){
		
		// Test Quick Find
		QuickFindUF qf = new QuickFindUF(20);
		qf.printDataStructure();
		qf.union(3,4);
		qf.printDataStructure();
		qf.union(4,8);
		qf.printDataStructure();
		qf.union(8,1);
		
		qf.printDataStructure();
		System.out.println(qf.connected(1, 4));
		System.out.println(qf.connected(2, 4));
		/////////
		
		// Test Quick Union
		QuickUnion qu = new QuickUnion(20);
		qu.printDataStructure();
		qu.union(3,4);
		qu.union(2,4);
		qu.union(5,8);
		qu.union(7,9);
		qu.union(9,8);
		qu.union(4,1);
		qu.printDataStructure();
		
		System.out.println(qu.connected(2, 4));
		System.out.println(qu.connected(8, 3));
		System.out.println(qu.connected(5, 9));
		
		// Test Quick Union Weighted
		QuickUnionWeightedWPathCompression quw = new QuickUnionWeightedWPathCompression(20);
		quw.printDataStructure();
		quw.union(3,4);
		quw.union(2,4);
		quw.union(5,8);
		quw.union(7,9);
		quw.union(9,8);
		quw.union(4,1);
		quw.printDataStructure();
		
		System.out.println(quw.connected(2, 4));
		System.out.println(quw.connected(8, 3));
		System.out.println(quw.connected(5, 9));
	}
}
