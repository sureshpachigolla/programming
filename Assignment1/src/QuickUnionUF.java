
public class QuickUnionUF {
	   private int[] grid;
	   public QuickUnionUF(int N)
	   {
	      this.grid = new int[N];
	      for (int i = 0; i < N; i++) 
	    	  this.grid[i] = i;
	   }
	   private int root(int i)
	   {
	      while (i != this.grid[i]) 
	    	  i = this.grid[i];
	      return i;
	   }
	   public boolean connected(int p, int q)
	   {
	      return root(p) == root(q);
	   }
	   public void union(int p, int q)
	   {
	      int i = root(p);
	      int j = root(q);
	      this.grid[i] = j;
	   }
	   public void printGrid(){
			for(int i=0; i < this.grid.length; i++){
				System.out.println(this.grid[i]);
			}
		}
}
