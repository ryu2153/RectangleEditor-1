import java.util.ArrayList;
import java.util.List;

public class Board {

    List<Rectangle> rectangles = new ArrayList<Rectangle>();

    public Board(){
    }

    public void add(Rectangle r){
       rectangles.add(r); 
    }

    public void remove(int index){
        try {
           rectangles.remove(index); 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("thre's not such a number of rectangle!(｡>﹏<｡)");
        } finally {
        }
    } 

    public List<Rectangle> getRectangles(){
        return rectangles;
    }

}
