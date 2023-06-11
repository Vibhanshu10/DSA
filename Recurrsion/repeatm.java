package Recurrsion;
public class repeatm {
    
    public static void fun(String str, StringBuilder s1 ,int index) {
        if(index>=str.length()){
            return;
        }
        char current= str.charAt(index);
        s1.append(current);
        if(index+1<str.length() && current==str.charAt(index+1)){
            s1.append("*");
        }
        fun(str,s1,index+1);
    }
    public static void main(String[] args) {
        String str ="aabbcc";
        StringBuilder s1=new StringBuilder();
        fun(str,s1,0);
        System.out.println(s1.toString());
    }
}

