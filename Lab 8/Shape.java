public abstract class Shape{

    public static int x=2;
    public static int y=5;

    public abstract void draw();
    public abstract double Area();

    public static void erase(){
        System.out.println("Shape is removed.");
    }

    public void moveLeft(Shape s,int new_x){
        System.out.println(s.getClass().getSimpleName() + " is being moved to the left.");
        s.erase();
        x=x-new_x;
        s.draw();

    }



}