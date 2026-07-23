int countNegatives(int** grid, int gridSize, int* gridColSize) {
    int count = 0;
    int cols = gridColSize[0]; // The number of columns
    
    // Run binary search on each row
    for (int i = 0; i < gridSize; i++) {
        int left = 0;
        int right = cols - 1;
        int mid = 0;
        
        while (left <= right) {
            mid = left + (right - left) / 2;
            
            if (grid[i][mid] < 0) {
                // It's negative, but there might be an earlier negative to the left
                right = mid - 1; 
            } else {
                // It's positive or zero, so the first negative is to the right
                left = mid + 1; 
            }
        }
        
        // When the loop ends, 'left' points to the first negative number.
        // We subtract 'left' from the total columns to get the count of negatives.
        count += (cols - left);
    }
    
    return count;
}