package Recurrsion;

public class sumBuild {
    static int sum =0;
public static void calculateSum(int n) { // Using Stack build
 if (n ==0){
return;
}
 sum += n;
 calculateSum(n - 1);
}
public static void main(String[]args) {
    calculateSum(7);
    System.out.println(sum);
}  
}
