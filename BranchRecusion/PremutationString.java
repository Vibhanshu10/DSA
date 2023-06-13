package BranchRecusion;

public class PremutationString {
    
    public static void perm(String str, String result) {
    
    if (str.length() == 0) {
        System.out.println(result);
        return;
    }
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        String remaining = str.substring(0, i) + str.substring(i + 1); 
        perm(remaining, result+ch);
 }
}
      public static void main(String[] args) {
         String input="abcd";
         perm(input,"");
 }
}
