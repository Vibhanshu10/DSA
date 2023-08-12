package Recurrsion;

public class prime {
    public static void main(String[] args) {
        int number = 17; // Change 'number' to the desired value
        boolean isPrime = isPrime(number);
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    
    public static boolean isPrime(int number) {
        return isPrime(number, number / 2);
    }
    
    public static boolean isPrime(int number, int divisor) {
        if (divisor == 1) {
            return true;
        } else {
            if (number % divisor == 0) {
                return false;
            } else {
              return isPrime(number, divisor - 1);
            }
}
}
}
