package Recurrsion;
public class replaceF {
    public static int replaced(int[]arr,int target,int replacement,int index) {
        if(index >=arr.length){
            return index;
        }
        if(arr[index]==target){
            arr[index]=replacement;      
        }
         return replaced(arr, target, replacement, index+1);
        
    }
    public static void main(String[] args) {
        int[] arr ={1,3,4,7,9,3};
        replaced(arr,3,5,0);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    
}
