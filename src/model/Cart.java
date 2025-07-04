public class Cart {
    Private List<CartItem> items;

    Cart(){
      this.items = new List<CartItem>;
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
}