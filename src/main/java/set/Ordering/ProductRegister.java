package main.java.set.Ordering;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegister {
    private Set<Product> productSet;

    public ProductRegister() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long code, String name, double price, int quantity) {
        productSet.add(new Product(code, name, price, quantity));
    }

    public Set<Product> showProductsByName() {
        Set<Product> productsByName = new TreeSet<>(productSet);
        return productsByName;
    }

    public Set<Product> showProductsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
        productsByPrice.addAll(productSet);
        return productsByPrice;
    }


}
