package logicprep.oops;


class Product {

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Cart {

    Product product;

    Cart(Product product) {
        this.product = product;
    }

    void displayCart() {
        System.out.println("Product : " + product.name);
        System.out.println("Price : " + product.price);
    }
}

class Order {

    Cart cart;

    Order(Cart cart) {
        this.cart = cart;
    }

    void placeOrder() {
        System.out.println("Order Placed Successfully");
    }
}

public class OnlineShopping {
    public static void main(String[] args) {

        Product p = new Product(101, "Laptop", 50000);

        Cart c = new Cart(p);

        Order o = new Order(c);

        c.displayCart();
        o.placeOrder();
    }
}
