public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("------------------");
        System.out.println("r1 specifications: ");
        System.out.println("------------------");
        r1.length = 10;
        r1.width = 100;
        
        System.out.println("length of rectangle: " + (r1.length));
        System.out.println("width of rectangle: " + (r1.width));
        
        
        double area1 = r1.show_Area();
        System.out.println("Area of rectangle: " + (area1));
 
        double perimeter1 = r1.show_perimeter();
        System.out.println("Perimeter of rectangle: " + (perimeter1));
        System.out.println(r1);
        System.out.println();


        Rectangle r2 = new Rectangle();
        System.out.println("------------------");
	System.out.println("r2 specifications: ");
        System.out.println("------------------");
        r2.length = 20;
        r2.width = 10;
        
        System.out.println("length of rectangle: " + (r2.length));
        System.out.println("width of rectangle: " + (r2.width));
        
        double area2 = r2.show_Area();
        System.out.println("Area of rectangle: " + (area2));

        double perimeter2 = r2.show_perimeter();
        System.out.println("Perimeter of rectangle: " + (perimeter2));
        System.out.println(r2);
        System.out.println();

        

    }
}