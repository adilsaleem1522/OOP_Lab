public class Demo {
    public static void main(String[] args) {
        Product p = new Product(5, "Laptop", 15.0, 40000.0);
        
        System.out.println("ID: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Quantity: " + p.getQuantity());
	System.out.println("Price: " + p.getPrice());
    }
}