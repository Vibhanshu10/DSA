
import java.util.*;
class RatInAMaze{
 static ArrayList<String> res;
 public static ArrayList<String> findPath(int[][] m, int n) {
 res = new ArrayList<>();
 
 int[] dx = { 1, 0, 0, -1 };
 int[] dy = { 0, -1, 1, 0 };
 if (m[0][0] == 1) {
 m[0][0] = 2;
 findPathHelper(m, n, 0, 0, dx, dy, "");
 }
 return res;
 }
 
 private static void findPathHelper(int[][] m, int n, int x, int
y, int[] dx, int[] dy, String path) {
 if (x == n - 1 && y == n - 1) {
 res.add(path);
 return;
 }
 String dir = "DLRU";
 for (int i = 0; i < 4; i++) { 
 int row = x + dx[i];
 int col = y + dy[i];
 if (isValid(row, col, m, n)) {
 m[row][col] = 2; 
 findPathHelper(m, n, row, col, dx, dy, path + 
dir.charAt(i));
 m[row][col] = 1; 
 }
 }
 }
 
 private static boolean isValid(int row, int col, int[][] m, int
n) {
 if (row >= 0 && row < n && col >= 0 && col < n && 
m[row][col] == 1) {
 return true;
 }
 return false;
 }
 public static void main(String[] args) {
 int m[][] = { { 1, 0, 0, 0, 0 },
 { 1, 1, 1, 1, 1 },
 { 1, 1, 1, 0, 1 },
 { 0, 0, 0, 0, 1 },
 { 0, 0, 0, 0, 1 } };
 int n = m.length;
 ArrayList<String> ans = findPath(m, n);
 System.out.println(ans);
 }
}
