package Recurrsion;

public class countBuild {
    public static void countZeros(int number, int count) { // Using Stack Building
 if (number == 0) {
 return;
 }
 int digit = number % 10;
 if (digit == 0) {
 count++;
 }
  countZeros(number/10,count);
    }
public static void main(String[] args) {
    countZeros(102030, 0);
}
}
