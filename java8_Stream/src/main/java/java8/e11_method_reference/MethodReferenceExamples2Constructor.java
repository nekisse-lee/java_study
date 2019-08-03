package java8.e11_method_reference;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

public class MethodReferenceExamples2Constructor {
    public static void main(String[] args) {

        final Product product = new Product(1L, "A", new BigDecimal("100"));




    }
}

@Data
@AllArgsConstructor
class Product {
    private Long id;
    private String name;
    private BigDecimal price;
}
