package Recurrsion;
class Series{
    public static double num(int n) {
       if(n==1){
        return 1;
        
       }
       
       double term=(double)n/Math.pow(n,n);
       return term+num(n-1);
    
}
     public static void main(String[] args) {
      
     double count = num(4);
     
      System.out.println("Number is Amerstrong "+count);
     
     

}
   }