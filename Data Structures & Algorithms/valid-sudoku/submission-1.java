class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check rows
        for(int row=0;row<9;row++){
            Set<Character> seen = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[row][i]=='.'){
                    continue;
                }
                if(!seen.add(board[row][i])){
                    return false;
                }
            }
        }

        //check col
        for(int col=0;col<9;col++){
            Set<Character> seen = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][col]=='.')continue;
                if(!seen.add(board[i][col])) return false;
            }

        }

        //check 3x3 grid
        for(int grid=0;grid<9;grid++){
            Set<Character> seen=new HashSet<>();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int row=(grid/3)*3+i;
                    int col=(grid%3)*3+j;
                    if(board[row][col]=='.')continue;
                    if(!seen.add(board[row][col])) return false;
                }
            }
        }

        return true;
        }
}
