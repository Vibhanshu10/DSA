package Recurrsion;

public class replace {
    public static void replaced(int[]arr,int target,int replacement,int index) {
        if(index >=arr.length){
            return;
        }
        if(arr[index]==target){
            arr[index]=replacement;
            replaced(arr, target, replacement, index+1);
        }
        else{
           replaced(arr, target, replacement, index+1); 
        }
        
    }
    public static void main(String[] args) {
        int[] arr ={1,3,4,7,9,3};
        replaced(arr,3,5,0);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
