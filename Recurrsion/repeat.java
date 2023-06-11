package Recurrsion;
public class repeat{
    public static String fun(String str) {
        if(str.length()<=1){
            return str;
        }

        if (str.charAt(0)== str.charAt(1)){
            return str.charAt(0)+ "*" + fun(str.substring(1));
        }
        else{
            return str.charAt(0)+ fun(str.substring(1));
        }
        
    }
    public static void main(String[] args) {
        String str ="aabbcc";
        String s =fun(str);
        System.out.println(s);
    }
}