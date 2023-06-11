package Recurrsion;
   
   class power{
    static int recur(int n) {
       if(n==0){
        return 1;
       }
       
       return 2*recur(n-1);
       
    }
     public static void main(String[] args) {
      
      int pow=recur(5);
      
    System.out.println("2 power 5 is "+pow);

}
   }

