package U8_FRQs;


public class ItemGrid {
    private Item[][] grid;
    private boolean called = false; // ADDED TO ENABLE TESTING

    // THIS METHOD WAS NOT SHOWN IN FRQ BUT IS
    // PROVIDED IN HERE TO ENABLE TESTING
    /** Constructor */
    public ItemGrid(Item[][] grid) {
        this.grid = grid;
    }

    // ADDED TO ENABLE TESTING
    public boolean isCalled() {
        return called;
    }

    // THIS METHOD WAS "IMPLEMENTATION NOT SHOWN" IN FRQ BUT IS
    // PROVIDED IN FULL HERE TO ENABLE TESTING
    /** Returns true if row is a valid row index and column is a valid
     *  column index and returns false otherwise.
     */
    public boolean isValid(int row, int column) {
        called = true;
        if (row < 0 || row >= grid.length) {
            return false;
        }
        if (column < 0 || column >= grid[0].length) {
            return false;
        }
        return true;
    }

    /** Returns the average value of all the items in grid,
     *  as described in part (a).
     */
    public double findAverage(){
        int sum = 0;
        int count = 0;
        for(Item[] row: grid){
            for(Item item: row){
                sum += item.getValue();
                count ++;
                }
            }
        return (double) sum / count;
    }
    

    /** Compares the item in row r and column c to the items to its
     *  left and to its right. Returns the name of the item with
     *  the greatest value, as described in part (b).
     *
     *  Precondition: r and c are valid indices
     */
    public String mostValuableNeighbor(int r, int c){
        String name = grid[r][c].getName();
        int value = grid[r][c].getValue();
        if(isValid(r, c+1) && grid[r][c+1].getValue() > value){
            name = grid[r][c + 1].getName();
            value = grid[r][c + 1].getValue();
        }
        if(isValid(r, c-1) && grid[r][c-1].getValue() > value){
            name = grid[r][c - 1].getName();
            value = grid[r][c - 1].getValue();
        }
    
    return name;
    }
    
}
