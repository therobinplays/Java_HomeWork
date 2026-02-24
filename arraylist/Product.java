package arrayList;

public class Product {

    private String name;
    private double price;
    private int productId;
    private static int count = 1;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.productId = count++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product{ID=" + productId +
                ", Name='" + name +
                "', Price=Rs. " + price + "}";
    }
}
