import model.Product;
import model.Cart;
import model.Customer;
import services.CheckoutService;


public class Main {
    
    public static void main(String[] args) {
    Product scratchCard = new Product("Scratch Card", 50, 20, null);
    Product Apple = new Product("apple", 20, 10, null);


Customer customer = new Customer("Ali", 1000.0);
     Cart cart = new Cart();
     cart.AddProduct(Apple,2);
     cart.AddProduct(scratchCard,5);
    System.out.println(cart);

    CheckoutService checkoutService = new CheckoutService();
        try {
            checkoutService.checkout(customer, cart);
        } catch (Exception e) {
            System.out.println("Checkout failed: " + e.getMessage());
        }
}
}