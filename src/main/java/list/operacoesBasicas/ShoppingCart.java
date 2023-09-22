package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        itemList.add(new Item(name,price,quantity));
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        for (Item i: itemList) {
            if (i.getName().equalsIgnoreCase(name)) {
                itemsToRemove.add(i);
            }
        }
        itemList.removeAll(itemsToRemove);
    }

    public double calculateTotalValue() {
        double totalValue = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double itemValue = item.getPrice() * item.getQuantity();
                totalValue += itemValue; //valorTotal = valorTotal + valorItem;
            }
            return totalValue;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public void showItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("The list is empty!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        ShoppingCart shoppingCart = new ShoppingCart();

        // Adicionando itens ao carrinho
        shoppingCart.addItem("Lápis", 2d, 3);
        shoppingCart.addItem("Lápis", 2d, 3);
        shoppingCart.addItem("Caderno", 35d, 1);
        shoppingCart.addItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        shoppingCart.showItens();

        // Removendo um item do carrinho
        shoppingCart.removeItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        shoppingCart.showItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("The total purchase price is = " + shoppingCart.calculateTotalValue());
    }
}

