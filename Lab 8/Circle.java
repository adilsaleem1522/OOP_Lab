public class Circle extends Shape{

    public double radius;

    Circle(double radius){
        this.radius=radius;
    }


    public void draw(){
        System.out.println("Circle is drawn.");
    }

    public double Area() {
        return 3.14*radius*radius;
    }
}