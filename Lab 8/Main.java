public class Main {

    public static void main(String[] args) {

        Shape shapes[] = new Shape[5];
        shapes[0]=new Circle(15);
        shapes[1]=new Rectangle(12,15);
        shapes[2]=new Square(12);
        shapes[3]=new Triangle(10,19);

        Utils.drawShapes(shapes);

        for(int i=0;i<4;i++){
            System.out.println("The area of " + shapes[i].getClass().getSimpleName() + " is: " + shapes[i].Area());
        }

        for(int j=0;j<4;j++) {
            shapes[j].moveLeft(shapes[j], 3);
            System.out.println("\n");
        }
    }
}