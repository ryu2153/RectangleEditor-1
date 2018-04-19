import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Board {

    List<Rectangle> rectangles = new ArrayList<Rectangle>();

    public Board(){
    }

    public void add(Rectangle r){
       rectangles.add(r); 
    }

    public void remove(int index){
       rectangles.remove(index); 
    } 

    public List<Rectangle> getRectangleInBoard(){
        return rectangles;
    }

}
