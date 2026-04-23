public class Triangle extends Shape{
    public double length;
    public double height;

    Triangle(double length,double height){
        this.length=length;
        this.height=height;
    }

    public void draw(){
        System.out.println("Triangle is drawn.");
    }

    public double Area(){
        return 0.5*length*height;
    }
}