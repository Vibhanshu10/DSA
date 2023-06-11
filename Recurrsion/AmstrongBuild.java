package Recurrsion;

public class AmstrongBuild {
    public static void main(String[] args) {
 int number = 153;
 if (isArmstrong(number))
 System.out.println(number + " is an Armstrong number.");
 else
 System.out.println(number + " is not an Armstrong number.");
 }
  public static boolean isArmstrong(int number) {
 int originalNumber = number;
 int sum = 0;
 int numberOfDigits = String.valueOf(number).length();
 
 calculateSum(number, numberOfDigits, sum);
 
 return originalNumber == sum;
 }
 
 public static void calculateSum(int number, int numberOfDigits, int sum) { // Using Stack Fall
 if (number != 0) {
 int digit = number % 10;
 sum += Math.pow(digit, numberOfDigits);
 calculateSum(number / 10, numberOfDigits, sum);
 }
}
}