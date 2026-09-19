class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> h = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {

                char c = board[i][j];

                if(c != '.') {

                    String r = c + "at row" + i;
                    String col = c + "at column" + j;
                    String box = c + "at box" + (i/3) + "." + (j/3);

                    if(!h.add(r))
                        return false;

                    if(!h.add(col))
                        return false;

                    if(!h.add(box))
                        return false;
                }
            }
        }

        return true;
    }
}