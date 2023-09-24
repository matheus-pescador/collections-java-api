package main.java.map.Search;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {
    private Map<Long, Product> productStockMap;


    public ProductStock() {
        this.productStockMap = new HashMap<>();
    }

    public void addProduct(long code, String name, int quantity, double price ) {
        productStockMap.put(code, new Product(name, price,quantity));
    }

    public void showProducts() {
        System.out.println(productStockMap);
    }

    public double calculateStockTotalValue() {
        double stockTotalValue = 0d;
        if(!productStockMap.isEmpty()) {
            for (Product p : productStockMap.values()) {
                stockTotalValue += p.getQuantity() * p.getPrice();
            }
        }
        return stockTotalValue;
    }

    public Product getMostExpensiveProduct () {
        Product mostExpensiveProduct = null;
        double mostExpensive = Double.MIN_VALUE;
        for (Product p : productStockMap.values()) {
            if(p.getPrice() > mostExpensive) {
                mostExpensiveProduct = p;
            }
        }
        return mostExpensiveProduct;
    }
}
