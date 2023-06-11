package ArrayRecursion;

import java.util.Arrays;

public class capitalized {
    private static void fun(String[]str,int index) {
        
    
     if(index>=str.length){
        return;
     }
      str[index]=str[index].toUpperCase();
      fun( str,index+1);
    
     
    }
    public static void main(String[] args) {
        String[] str={"foo","bar","world"};
       fun(str,0);
       System.out.println(Arrays.toString(str));

    }
}
