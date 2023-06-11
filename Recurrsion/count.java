package Recurrsion;
class count{
    public static int num(int n) {
       if(n==0){
        return 0;
       }
       if(n%10==0)
       return 1+num(n/10);
       else{
        return num(n/10);
       }
       
    }
     public static void main(String[] args) {
      
      int count=num(50809000);
      
    System.out.println("Total Zero Count is "+count);

}
   }