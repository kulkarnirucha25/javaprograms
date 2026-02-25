import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class EcommerceTest {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Customer c1 = new Customer("Rucha");

        Order o1 = new Order(p1, 2);

        c1.displayCustomer();
        o1.placeOrder();
    }
}