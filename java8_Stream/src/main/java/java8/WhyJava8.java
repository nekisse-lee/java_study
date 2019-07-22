package java8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class WhyJava8 {
    public static void main(String[] args) {

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < numbers.size(); i++) {
//            stringBuilder.append(numbers.get(i));
//            if (i != numbers.size() - 1) {
//                stringBuilder.append(" : ");
//            }
//        }


        String separator = " : ";
        for (Integer number : numbers) {
            stringBuilder.append(number).append(separator);
        }
        int stringLength = stringBuilder.length();
        if (stringLength > 0) {
            stringBuilder.delete(stringLength - separator.length(), stringLength);
        }

        System.out.println(stringBuilder.toString());
//----------------------------------vs--------------------------------

        String result = numbers.stream()
                            .map(s -> String.valueOf(s))
                            .collect(joining(" : "));
        System.out.println(result);
    }
}
