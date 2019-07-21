package java.java8;

import java.util.Arrays;
import java.util.List;

public class WhyJava8 {
    public static void main(String[] args) {

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < numbers.size(); i++) {
//            sb.append(numbers.get(i));
//            if (i != numbers.size() - 1) {
//                sb.append(" : ");
//            }
//        }


        for (Integer number : numbers) {
            sb.append(number).append(" | ");
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 3, sb.length());
        }



        System.out.println(sb.toString());



    }
}
