public class Product {
    private String name;
    private Double price;
    private Int quantity;
    private LocalDate expiryDate;

    public Product(String name, double price, int quantity,LocalDate expiryDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
          if (expiryDate != null) {
            this.expiryDate = expiryDate;
        } else {
            this.expiryDate = LocalDate.of(9999, 12, 31);
        }
    }
    public Product() {
        this.expiryDate = LocalDate.of(9999, 12, 31);
    }
     public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }
    public Int decreaseQuantity(int amount) {
        if (amount <= quantity) {
            this.quantity -= amount;
        } else {
          return -1;
        }
        return 0;
    }
    
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
}