public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] seenInRow = new boolean[9][9];
        boolean[][] seenInCol = new boolean[9][9];
        boolean[][] seenInBox = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char currentVal = board[r][c];

                if (currentVal == '.') {
                    continue;
                }

                int numIndex = currentVal - '1';
                int boxIndex = (r / 3) * 3 + (c / 3);

                if (seenInRow[r][numIndex] || 
                    seenInCol[c][numIndex] || 
                    seenInBox[boxIndex][numIndex]) {
                    return false; 
                }

                seenInRow[r][numIndex] = true;
                seenInCol[c][numIndex] = true;
                seenInBox[boxIndex][numIndex] = true;
            }
        }
        return true;
    }
}