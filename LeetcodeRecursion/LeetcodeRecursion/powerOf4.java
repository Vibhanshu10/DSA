package LeetcodeRecursion;

public class powerOf4 {
     public static boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n>1){
            return n%4==0&&isPowerOfThree(n/4);
        }
        else{
            return false;
        }
        }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(64));
    }
}
