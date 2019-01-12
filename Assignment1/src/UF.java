
public class UF {
	
	public int[] grid;
	
	public UF(int N){
		this.grid = new int[N];
		for(int i=0; i < this.grid.length; i++){
			this.grid[i] = i;
		}
	}
	public boolean connected (int p, int q){
		if(this.grid[p] == this.grid[q]){	
			return true;
		}
		else
			return false;
		
	}
	public void union (int p, int q){
		int pid = this.grid[p];
		int qid = this.grid[q];
		for(int i=0; i < this.grid.length; i++){
			if(this.grid[i] == pid)
			this.grid[i] = qid;
		}
	}
	public void printGrid(){
		for(int i=0; i < this.grid.length; i++){
			System.out.println(this.grid[i]);
		}
	}

}
