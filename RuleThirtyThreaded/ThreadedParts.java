public class ThreadedParts extends Thread {
    public int end;
    public int start;
    public int[] grid;
    public int[] curr;
    public int generation;

    ThreadedParts(int[] array, int start, int end) {
        grid = new int[array.length];
        for (int i = 0; i < array.length; i++){
            grid[i] = array[i];
        }
        this.start = start;
        this.end = end;
        this.generation = generation;
        this.curr = new int[end];
    }

    private void solve() {
        for (int i = 0; i < end; i++){
                curr[i]= value(i+start);
            }
        }

    private int value(int j){
        int left = (j == 0) ? 0 : grid[j-1];
        int mid = grid[j];
        int right = (j == grid.length - 1) ? 0 : grid[j+1];
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

    public void run() {
        solve();
    }
}