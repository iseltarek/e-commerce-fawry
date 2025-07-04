package model;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    private List<CartItem> items;

   public Cart(){
     items = new ArrayList<>();
    }

    public void AddProduct(Product product, int quantity){
         for (CartItem item : items) {
            if (item.getProduct().equals(product)) {
                int newQuantity = item.getQuantity() + quantity;
                item.setQuantity(newQuantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }
    public void removeProduct(Product product) {
        items.removeIf(item -> item.getProduct().equals(product));
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public List<CartItem> getItems() {
        return items;
    }
    public double getSubtotal() {
        double subtotal = 0;
        for (CartItem item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }
}