public class RuleThirtyThreaded {
    final static int THREAD_COUNT = 10;
    public int[] grid;
    public int size;

    public RuleThirtyThreaded(int size) {
        grid = new int[size];
        this.size = size;
    }

    public void initialiser() {
        for (int j = 0; j < size; j++) {
            grid[j] =  (j == size / 2) ? 1 : 0;
            System.out.print(grid[j]);
        }
        System.out.println();
    }

    public void print() {
        initialiser();
        int partition;
        if(size < THREAD_COUNT){ 
            partition = size;
        }else{
            partition = THREAD_COUNT;
        }

        ThreadedParts[] parts = new ThreadedParts[partition];
        int part = size / partition;
        int excess = size % partition;

        for (int ctr = 0; ctr < size - 1; ctr++) {
            int start = 0;
            
            for (int j = 0; j < partition; j++) {
                if( j < excess){
                    parts[j] = new ThreadedParts(grid,start,part + 1);
                    start = start + part + 1;
                }else{
                    parts[j] = new ThreadedParts(grid,start,part);
                    start = start + part;
                }

                parts[j].start();
                while(parts[j].isAlive()) {
                    try {
                        parts[j].join();
                    } catch(InterruptedException e) {
                        System.err.println("thread interrupted: " + e.getMessage());
                    }
                }
            }

            for(int i = 0, j = 0; i < parts.length; i++) {
                for (int num: parts[i].curr) {
                    grid[j] = num;
                    System.out.print(num);
                    j++;
                }
            }
            System.out.println();
        }
    }
}