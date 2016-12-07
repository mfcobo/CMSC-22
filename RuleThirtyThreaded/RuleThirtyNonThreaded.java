
public class RuleThirtyNonThreaded{
    public int[][] grid;
    public int size;

    RuleThirtyNonThreaded(int size) {
        grid = new int[size][size];
        this.size = size;
    }

	public void initialiser(){
		int i=0, j=0;
		while(j < size){
			grid[i][j] = 0;
			j++;
		}
		grid[0][size/2] = 1;
	}

	public void print(){
		initialiser();
		draw();
		int i=0, j=0;
		while(i < size){
			while(j < size){
				System.out.print(grid[i][j]); 
				j++;
			}
			j = 0;
			System.out.println(); 
			i++;
		}
	}

	public int[][] draw(){
		int i=1,j=0;
		while(i < size){
			while(j < size){
				grid[i][j] = value(i,j);
				j++;
			}
			j = 0;
			i++;
		}
		return grid;
	}

	public int value(int i,int j){
		int left = (j == 0) ? 0 : grid[i-1][j-1];
		int mid = grid[i-1][j];
		int right = (j == size-1) ? 0 : grid[i-1][j+1];
		if(left == 1 && mid == 0 && right == 0)
			return 1;
		if(left == 0 && mid == 1 && right == 1)
			return 1;
		if(left == 0 && mid == 1 && right == 0)
			return 1;
		if(left == 0 && mid == 0 && right == 1)
			return 1;
		return 0;
	}
}