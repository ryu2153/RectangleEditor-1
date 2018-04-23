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

            displayAll();

            hi();
            
            System.out.println("Command->");
            String str = br.readLine(); 

            switch (str){ 

                case "create":
                    int width = readLine("width->");
                    int height = readLine("height->");
                    int x = readLine("x->");
                    int y = readLine("y->");
                    command.create(width,height,x,y); 
                    break;

                case "delete":
                    int index = readLine("index->");
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

    public static int readLine(String str) {

        System.out.println(str);

        InputStreamReader is = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(is); 

        int index = -1;

        while (true){

            String input_str = "";

            try {
                input_str = br.readLine(); 
            } catch (IOException e){
                System.out.println( "keybord is perhaps broken!(｡>﹏<｡)" );
            }

            if(input_str!=""){

                try {
                    index = Integer.parseInt(input_str);

                } catch (NumberFormatException e) {
                    System.out.println("wrong input! please input again.(｡>﹏<｡)");
                    System.out.println(str);
                    
                }

                if(index!=-1){
                    return index;
                }

                input_str = "";

            }
        }
    }

    public static void hi(){
        System.out.println("- create");
        System.out.println("- delete");
        System.out.println("- exit");
    }

    public static void displayAll(){
        List<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles = command.getRectangles();

        ListIterator<Rectangle> it = rectangles.listIterator();

        while(it.hasNext()){
            System.out.println("[" + it.nextIndex() + "]"+ it.next().showRectangle());
        }
    }

}

