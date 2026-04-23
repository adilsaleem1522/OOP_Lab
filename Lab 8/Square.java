public class Square extends Shape{

    double length;

    Square(double length){
        this.length=length;
    }

    public void draw(){
        System.out.println("Square is drawn.");
    }

    public double Area(){
        return length*length;
    }
}