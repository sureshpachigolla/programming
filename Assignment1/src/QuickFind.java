import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		StdOut.println("------quick find------");
		int N = StdIn.readInt();
		UF uf = new UF(N);
		
		uf.union(1, 2);
		uf.union(1, 3);
		uf.union(1, 4);
		StdOut.println(uf.connected(1, 5));
		uf.printGrid();
		StdOut.println("------quick union------");
		*/
		int M = StdIn.readInt();
		QuickUnionUF QUF = new QuickUnionUF(M);
		
		QUF.union(1, 2);
		QUF.union(1, 3);
		QUF.union(1, 4);
		StdOut.println(QUF.connected(1, 5));
		QUF.printGrid();
		/*
		while (!StdIn.isEmpty())
		   {
		      int p = StdIn.readInt();
		      int q = StdIn.readInt();
		      if (!uf.connected(p, q))
		      {
		         uf.union(p, q);
		         StdOut.println(p + " " + q);
		      }
		   }*/
		
		
	}

}
