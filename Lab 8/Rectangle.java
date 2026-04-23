public class Rectangle extends Shape{

    public double length;
    public double width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public void draw(){
        System.out.println("Rectangle is drawn.");
    }

    public double Area(){
        return length*width;
    }

}