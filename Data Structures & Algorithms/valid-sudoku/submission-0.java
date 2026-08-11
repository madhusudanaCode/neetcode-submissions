class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Set<Character>> rows = new HashMap<>();
        HashMap<Integer,Set<Character>> cols = new HashMap<>();
        HashMap<Integer,Set<Character>> squares = new HashMap<>();
        for(int i =0;i<9;i++){
            rows.put(i,new HashSet<>());
            cols.put(i,new HashSet<>());
            squares.put(i,new HashSet<>());
        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                int grid = (r/3)*3+(c/3);
                if(board[r][c]=='.'){
                    continue;
                }
                if(rows.get(r).contains(board[r][c]) || cols.get(c).contains(board[r][c]) || squares.get(grid).contains(board[r][c]) ){
                    return false;
                }
                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                squares.get(grid).add(board[r][c]);
    }
    
}
return true;
    }
}