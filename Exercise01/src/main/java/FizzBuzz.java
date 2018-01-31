import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args){
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        System.out.println(convertToFizzBuzz(min,max));
    }

    public static String convertToFizzBuzz(int min, int max){
        List<String> result = new ArrayList<>();

        for (int i=min; i<=max; i++){
            if (i%3==0){
                if (i%5==0){
                    result.add("fizzbuzz");
                } else {
                    result.add("fizz");
                }
            } else if (i%5==0){
                result.add("buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return String.join(" ", result);
    }
}
