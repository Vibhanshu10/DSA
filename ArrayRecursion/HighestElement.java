package ArrayRecursion;
public class HighestElement {
    public static int fun(int[]arr,int n) {
        if(n==1){
            return arr[0];
        }
        
         return Math.max(arr[n-1],fun(arr,n-1));
    }
    public static void main(String[] args) {
        int[]arr ={4,6,5,3,9};
        
        int element= fun(arr,arr.length);
        System.out.println("Highest Elemnt is :" +element);
    }
}
