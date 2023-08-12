package LeetcodeRecursion;

import java.util.HashSet;
import java.util.Set;
public class ValidSudoku {
public static boolean isValidSudoku(char[][] board) {

// Check rows
for (int i = 0; i < 9; i++) {
Set<Character> seen = new HashSet<>();
for (int j = 0; j < 9; j++) {
char digit = board[i][j];
if (digit != '.' && seen.contains(digit)) {
return false;
}
seen.add(digit);
}
}
// Check columns
for (int j = 0; j < 9; j++) {
Set<Character> seen = new HashSet<>();
for (int i = 0; i < 9; i++) {
char digit = board[i][j];
if (digit != '.' && seen.contains(digit)) {
return false;
}
seen.add(digit);
}
}
// Check sub-boxes
for (int i = 0; i < 9; i += 3) {
for (int j = 0; j < 9; j += 3) {
Set<Character> seen = new HashSet<>();
for (int k = 0; k < 9; k++) {
int row = i + k / 3;
int col = j + k % 3;
char digit = board[row][col];
if (digit != '.' && seen.contains(digit))
{
return false;
}
seen.add(digit);
}
}
}
return true;
}
public static void main(String[] args) {
char board[][]={ { 7, 9, 2, 1, 5, 4, 3, 8, 6 },
{ 6, 4, 3, 8, 2, 7, 1, 5, 9 },
{ 8, 5, 1, 3, 9, 6, 7, 2, 4 },
{ 2, 6, 5, 9, 7, 3, 8, 4, 1 },
{ 4, 8, 9, 5, 6, 1, 2, 7, 3 },
{ 3, 1, 7, 4, 8, 2, 9, 6, 5 },
{ 1, 3, 6, 7, 4, 8, 5, 9, 2 },
{ 9, 7, 4, 2, 1, 5, 6, 3, 8 },
{ 5, 2, 8, 6, 3, 9, 4, 1, 7 } };
System.out.println(isValidSudoku(board));

}
} 