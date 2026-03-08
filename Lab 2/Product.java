public class Product {
    private int id;
    private String name;
    private double quantity;
    private double price;

    public Product() {}

    public Product(int id, String name, double quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
    return id; }
    public String getName() { 
    return name; }
    public double getQuantity() {
    return quantity; }
    public double getPrice() {
    return price; }

}