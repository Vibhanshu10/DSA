package Recurrsion;
public class search {
    public static int searche(int arr[],int N,int n) {
        if(N==0){
         return -1; 
        }
        else if(arr[N]==n){
           return N;
        }
        else{
            return searche(arr, N-1, n);
        }
        
     
 }
      public static void main(String[] args) {
       int arr[]={1,3,4,5,2,7};
        searche(arr,arr.length-1,4);
      
       System.out.println("Index is "+searche(arr,arr.length-1,4));
    
 }
}
