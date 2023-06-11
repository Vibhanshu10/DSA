package Recurrsion;
public class occurence {
    public static int search(int arr[],int N,int n) {
        
        if(N==0){
         return 0; 
        }
        else if(arr[N]==n){
            return 1+search(arr, N-1, n);   
        }

        else{
            return search(arr, N-1, n);
        }
       
        
     
 }
      public static void main(String[] args) {
       int arr[]={5,3,4,5,4,7};
       
        search(arr,arr.length-1,4);
      
       System.out.println("Index is "+search(arr,arr.length-1,4));
    
 }
}
