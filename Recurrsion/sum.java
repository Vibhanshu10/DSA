package Recurrsion;
class sum{
    static int num(int n) {
       if(n==1){
        return 1;
       }
       
       return n+num(n-1);
       
    }
     public static void main(String[] args) {
      
      int sum=num(5);
      
    System.out.println("Natural no sum is "+sum);

}
   }