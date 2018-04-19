import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RectangleEditor{

    public static Command command = new Command();

    public static void main(String[] args) throws IOException {

        
        InputStreamReader is = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(is); 
    
        boolean isEnd = false;

        while(!isEnd){

            hi();

            displayAll();
            
            System.out.println("Command->");
            String str = br.readLine(); 

            switch (str){ 

                case "create":
                System.out.println("width->");
                str = br.readLine(); 
                int width = Integer.parseInt(str);
                System.out.println("height->");
                str = br.readLine(); 
                int height = Integer.parseInt(str);
                System.out.println("x->");
                str = br.readLine(); 
                int x = Integer.parseInt(str);
                System.out.println("y->");
                str = br.readLine(); 
                int y = Integer.parseInt(str);
                command.create(width,height,x,y); 
                break;

                case "delete":
                System.out.println("index->");
                str = br.readLine(); 
                int index = Integer.parseInt(str);
                command.delete(index); 
                break;

                case "exit":
                isEnd = true;
                break;

                default:
                System.out.println("wrong command!(｡>﹏<｡)");
                break;

            }
        }
    }


    public static void hi(){
        System.out.println("----おしながき(*´∀｀*)----");
        System.out.println("- create");
        System.out.println("- delete");
        System.out.println("- exit");
    }

    public static void displayAll(){
        List<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles = command.getRectangleInBoard();

        ListIterator<Rectangle> it = rectangles.listIterator();

        while(it.hasNext()){
            System.out.println("----シカクいちらん(*´∀｀*)----");
            System.out.println("[" + it.nextIndex() + "]"+ it.next().getRectangle());
        }
    }

}

