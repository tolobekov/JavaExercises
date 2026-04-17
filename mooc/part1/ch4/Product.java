package mooc.part1.ch4;

public class Product {
    private String name;
    private int quantity;
    private Double price;

    public Product(String initialName, double initialPice, int initialQuantity) {
        name = initialName;
        price = initialPice;
        quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.printf("%s, price %.1f, %d pcs%n", this.name, this.price, this.quantity);
    }
}
