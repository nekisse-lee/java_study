package java8.e11_method_reference;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.function.Function;

public class MethodReferenceExamples2Constructor {
    public static void main(String[] args) {
        final Section section1 = new Section(1);

        final Function<Integer, Section> sectionFactoryWithLambdaExpression = number -> new Section(number);
        final Section sectionWithLambdaExpression = sectionFactoryWithLambdaExpression.apply(1);

        final Function<Integer, Section> sectionFactoryWithMethodReference = Section::new;
        final Section section1WithMethodReference = sectionFactoryWithMethodReference.apply(1);


        System.out.println(section1);
        System.out.println(sectionWithLambdaExpression);
        System.out.println(section1WithMethodReference);

        System.out.println("================================================");

        final OldProduct product = new OldProduct(1L, "A", new BigDecimal("100"));
        System.out.println(product);

        final OldProductCreator productCreator = OldProduct::new;
        System.out.println(productCreator.create(1L, "A", new BigDecimal("100")));


        System.out.println("================================================");
        ProductA a = createProduct(1L, "A", new BigDecimal("123"), ProductA::new);
        ProductB b = createProduct(2L, "B", new BigDecimal("111"), ProductB::new);
        ProductC c = createProduct(3L, "C", new BigDecimal("10"), ProductC::new);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }

    private static <T extends Product> T createProduct(final Long id,
                                                       final String name,
                                                       final BigDecimal price,
                                                       final ProductCreator<T> productCreator) {
        if (id == null || id < 1L) {
            throw new IllegalArgumentException("The id must be a positive Long.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("The name is not given.");
        }
        if (price == null || price.compareTo(BigDecimal.ZERO) <= 0) { //price <= ZERO
            throw new IllegalArgumentException("The price must be greater then 0.");
        }
        return productCreator.create(id, name, price);
    }

}

@FunctionalInterface
interface OldProductCreator {
    OldProduct create(Long id, String name, BigDecimal price);
}

@FunctionalInterface
interface ProductCreator<T extends Product> {
    T create(Long id, String name, BigDecimal price);
}


@AllArgsConstructor
@Data
class Section {
    private int number;

}


@Data
@AllArgsConstructor
abstract class Product {
    private Long id;
    private String name;
    private BigDecimal price;
}

@Data
@AllArgsConstructor
class OldProduct {
    private Long id;
    private String name;
    private BigDecimal price;
}


class ProductA extends Product {
    public ProductA(Long id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "A = " + super.toString();
    }
}

class ProductB extends Product {
    public ProductB(Long id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "B = " + super.toString();
    }
}

class ProductC extends Product {
    public ProductC(Long id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "C = " + super.toString();
    }
}

