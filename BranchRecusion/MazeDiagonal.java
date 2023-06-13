package BranchRecusion;

public class MazeDiagonal {
    public static void mazePathProblem(int row, int col, int endRow, int endCol, String result) {
   
    if (row == endRow && col == endCol) {
        System.out.println(result);
        return;
    }
    if (col + 1 <= endCol) {
        mazePathProblem(row, col + 1, endRow, endCol, result + "R");
    }

    if (row + 1 <= endRow) {
        mazePathProblem(row + 1, col, endRow, endCol, result + "D");
    }

    if (col + 1 <= endCol && row + 1 <= endRow) {
        mazePathProblem(row + 1, col + 1, endRow, endCol, result+"X");
 }
}

    public static void main(String[] args) {
         mazePathProblem(0,0,3,3,"");
    }
}
