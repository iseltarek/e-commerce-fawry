package services;


import model.*;


public class CheckoutService {
    public CheckoutService(){}
     public void checkout(Customer customer, Cart cart) {
        if(cart.isEmpty())
        {
             throw new IllegalStateException("cart is empty . Add products first");
        }
        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            if (item.getQuantity() > product.getQuantity()) {
                throw new IllegalStateException("Product " + product.getName() + " is out of stock.");
            }
            if (product.isExpired()) {
                throw new IllegalStateException("Product " + product.getName() + " is expired.");
            }
        }

        double total = cart.getSubtotal();
        if(total > customer.getBalance()){
               throw new IllegalStateException("Customer Balance is Not Enough");
        }
        customer.decreaseBalance(total);

        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            product.decreaseQuantity(item.getQuantity());
        }
      printReceipt(cart, total, customer);

     }

     private void printReceipt(Cart cart,double total, Customer customer) {
         System.out.println("\n** Checkout Receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.printf("%d x %s\t%.2f each\n",
                    item.getQuantity(),
                    item.getProduct().getName(),
                    item.getProduct().getPrice());
        }
        System.out.println("------------------------------");
        System.out.printf("Total:\t\t%.2f\n", total);
        System.out.printf("Customer balance after payment:\t%.2f\n", customer.getBalance());
     }
}