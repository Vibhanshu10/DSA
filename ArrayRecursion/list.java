package ArrayRecursion;
import java.util.List;
public class list{
  public static int calculateProduct(List<Integer> numbers) {
 if (numbers.isEmpty()) {
 return 1;
 }
 
 int first = numbers.get(0);
 List<Integer> remaining = numbers.subList(1, numbers.size());
 int productOfRemaining = calculateProduct(remaining);
 return first * productOfRemaining;
 }

 public static void main(String[] args) {
 List<Integer> numbers = List.of(2, 3, 4, 5);
 int product = calculateProduct(numbers);
 System.out.println("Product: " + product);
 }
}

