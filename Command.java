import java.util.ArrayList;
import java.util.List;

public class Command {

    public Board board;

    public Command(){
        board = new Board();
    }

    public Rectangle create(int width,int height,int x,int y){
        Rectangle r = new Rectangle(width,height,x,y);
        board.add(r); 
        return r;
    }
    
    public void delete(int index){
       board.remove(index); 
    }
    
    public List<Rectangle> getRectangles(){
        return board.getRectangles();
    }

}
