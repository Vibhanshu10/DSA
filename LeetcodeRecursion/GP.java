import java.util.ArrayList;
import java.util.List;
class GP {
 public static List<String> generateParenthesis(int n) {
 List<String>result=new ArrayList<>();
 StringBuilder sb=new StringBuilder();
 generateBrackets(result,n,0,0,sb);
 return result;
 
 }
 private static void generateBrackets(List<String>result ,int
 n,int opening ,int closing,StringBuilder output){
 if(output.length()==n*2){
 result.add(output.toString());
 return;
 }
 
 if(opening<n){
 output.append("(");
 generateBrackets(result,n,opening+1,closing,output);
 output.deleteCharAt(output.length()-1);
 }

 if(closing<opening){
 output.append(")");

 generateBrackets(result,n,opening,closing+1,output);
 output.deleteCharAt(output.length()-1);
 }
 }
public static void main(String args[]) {
int n=4;
System.out.println(generateParenthesis(n));
}
}

