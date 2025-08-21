package java_advanced_01.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "s20", "삼성", 1000000));
        products.add(new Product("2", "s21", "삼성", 1100000));
        products.add(new Product("3", "s22", "삼성", 1200000));
        products.add(new Product("4", "s23", "삼성", 1300000));
        products.add(new Product("5", "s24", "삼성", 1400000));

        Stream<Product> productStream = products.stream();
        productStream.forEach(product -> {
            System.out.println(product.toString());
        });

    }
}
