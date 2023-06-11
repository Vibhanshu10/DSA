package Recurrsion;
class Amstrong{
    public static int num(int n) {
       if(n==0){
        return 0;
        
       }
       
       int r= n%10;
       return r*r*r+num(n/10);
    
}
     public static void main(String[] args) {
      int n=123;
      int count=num(123);
     if(count == n){
      System.out.println("Number is Amerstrong ");
     }
     else{
        System.out.println("Not Amstrong");
     }

}
   }