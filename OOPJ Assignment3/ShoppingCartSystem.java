import java.util.ArrayList;
import java.util.List;

class Product implements Discountable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
	
    public void applyDiscount(double percentage) {
        double discountAmount = (price * percentage) / 100;
        price -= discountAmount;
        System.out.println("Applying " + percentage + "% discount to " + name);
    }
}
interface Discountable {
    void applyDiscount(double percentage);
}
abstract class CartItem {
    public abstract double calculateTotalPrice();
}
class Cart extends CartItem {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
class ShoppingCartSystem {
    public static void main(String[] args) {
        Product laptop = new Product(1, "Laptop", 50000);
        Product mouse = new Product(2, "Mouse", 500);
        Product keyboard = new Product(3, "Keyboard", 1200);

        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        laptop.applyDiscount(10);

        System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
    }
}
