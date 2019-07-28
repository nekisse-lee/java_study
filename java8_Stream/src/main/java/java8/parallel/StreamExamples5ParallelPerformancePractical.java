package java8.parallel;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

@SuppressWarnings("ALL")
public class StreamExamples5ParallelPerformancePractical {

    private static final String[] priceStrings = {"1.0", "100.99", "35.75", "21.30", "88.00"};

    private static final BigDecimal[] targetPrices = {new BigDecimal("30"), new BigDecimal("20"), new BigDecimal("31")};


    private static final Random random = new Random(123);
    private static final Random targetPriceRandom = new Random(111);


    private static final List<Product> products;

    static{
        final int length = 8_000_000;
        final Product[] list = new Product[length];

        for (int i = 1; i <= length; i++) {
            list[i-1] = new Product((long) i, "Product" + i, new BigDecimal(priceStrings[random.nextInt(5)]));
        }
        products = Arrays.asList(list);
    }

    private static BigDecimal imperativeSum(List<Product> products, Predicate<Product> predicate) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product : products) {
            if (predicate.test(product)) {
                sum = sum.add(product.getPrice());
            }
        }
        return sum;
    }

    private static BigDecimal streamSum(Stream<Product> stream, Predicate<Product> predicate) {
        return stream.filter(predicate).map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }


    private static void imperativeTest(BigDecimal targetPrice) {
        System.out.println("=========================================");
        System.out.println("\nImperative Sum\n----------------------------");
        long start = System.currentTimeMillis();
        System.out.println("Sum : " +
            imperativeSum(products, product -> product.getPrice().compareTo(targetPrice) >= 0)
        );
        System.out.println("It took " + (System.currentTimeMillis() - start) + " ms .");
        System.out.println("=========================================");
    }

    public static void streamTest(BigDecimal targetPrice) {
        System.out.println("=========================================");
        System.out.println("\nStream Sum\n----------------------------");
        long start = System.currentTimeMillis();
        System.out.println("Sum : " +
            streamSum(products.stream(), product -> product.getPrice().compareTo(targetPrice) >= 0)
        );
        System.out.println("It took " + (System.currentTimeMillis() - start) + " ms .");
        System.out.println("=========================================");
    }


    public static void parallelStreamTest(BigDecimal targetPrice) {
        System.out.println("=========================================");
        System.out.println("\nparallelStream Sum\n----------------------------");
        long start = System.currentTimeMillis();
        System.out.println("Sum : " +
            streamSum(products.parallelStream(), product -> product.getPrice().compareTo(targetPrice) >= 0)
        );
        System.out.println("It took " + (System.currentTimeMillis() - start) + " ms .");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        BigDecimal targetPrice = new BigDecimal("40");
        imperativeTest(targetPrice);
        streamTest(targetPrice);
        parallelStreamTest(targetPrice);

        System.out.println("\nIgnore Tests Above\n===============\n");
        System.out.println("Start!");
        for (int i = 0; i < 5; i++) {
            BigDecimal price = targetPrices[targetPriceRandom.nextInt(3)];

            imperativeTest(price);
            streamTest(price);
            parallelStreamTest(price);
        }
    }
}

@Data
@AllArgsConstructor
class Product {
    private Long id;
    private String name;

    private BigDecimal price;
}