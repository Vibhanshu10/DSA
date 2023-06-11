package Recurrsion;

public class adjacent {
    
    public static String replaceAdjacent(String str) {
        if (str.length() <= 1) {
            return str;
         } 
        else {
            char current = str.charAt(0);
            String remaining = str.substring(1);
            String replaced = replaceAdjacent(remaining);

            if (current == replaced.charAt(0)) {
                return current + "#" + replaced.substring(1);
            } 
            else {
            return current + replaced;
            }
           }
          }

    public static void main(String[] args) {
        String input = "aabbcc"; // Change 'input' to the desired string
        String output = replaceAdjacent(input);
        System.out.println(output);
      }
    }
