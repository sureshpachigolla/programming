import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Percolation {
	   public Percolation(int n){
		   if (n <= 0){
			   throw new IllegalArgumentException("The n-by-n cannot be created for n<=0");
		   }
		   char[][] grid= new char[n-1][n-1];
	   }
	   /*
	   public    void open(int row, int col){
		   // open site (row, col) if it is not open already
	   }
	   public boolean isOpen(int row, int col){
		   // is site (row, col) open?
	   }
	   public boolean isFull(int row, int col){
		   // is site (row, col) full?
	   }
	   public     int numberOfOpenSites(){
		   // number of open sites
	   }
	   public boolean percolates(){
		   // does the system percolate?
	   }
       */
	   public static void main(String[] args){
		   Percolation percolation = new Percolation(10);
		   int N = StdIn.readInt();
		   UF uf = new UF(N);
		   while (!StdIn.isEmpty())
		   {
		      int p = StdIn.readInt();
		      int q = StdIn.readInt();
		      if (!uf.connected(p, q))
		      {
		         uf.union(p, q);
		         StdOut.println(p + " " + q);
		      }
		   }
	   }
}
