
public class Percolation {
	
	private int[][] id;
	
	// create n-by-n grid, with all sites blocked
	public Percolation(int n) {
		id = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				id[i][j] = 0; //Instantiate as closed
			}
		}
		
	}
	
	public    void open(int row, int col) {
	   // open site (row, col) if it is not open already
	}
   
	/*public boolean isOpen(int row, int col) {
		// is site (row, col) open?
	}
	public boolean isFull(int row, int col) {
		// is site (row, col) full?
	}
	public     int numberOfOpenSites() {
		// number of open sites
	}
	public boolean percolates() {
		// does the system percolate?
	}*/
	
	public void printDataStructure() {
		for(int i=0;i<id.length;i++) {
			for(int j = 0;j<id.length; j++){
				System.out.print(i+","+j+":" + id[i][j] + " ");
			}
			System.out.println();	
		}
	}

	public static void main(String[] args) {
		Percolation p = new Percolation(50);
		p.printDataStructure();
	}
}
