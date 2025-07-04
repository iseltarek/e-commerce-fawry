public class CartItem {
    private Product product;
    private Int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

     public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

}