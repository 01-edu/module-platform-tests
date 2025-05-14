
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        // Use hash sets to record the status
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    // Check row
                    if (!rows[i].add(num)) {
                        return false;
                    }
                    // Check column
                    if (!cols[j].add(num)) {
                        return false;
                    }
                    // Check box
                    int boxIndex = (i / 3) * 3 + j / 3;
                    if (!boxes[boxIndex].add(num)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
