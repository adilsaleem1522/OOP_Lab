public class Utils{

    public static void drawShapes(Shape shapes[]){
        for(Shape s: shapes)
                if(s != null) {
                    s.draw();
                    s.erase();
                }

    }


}