public class Rectangle {

    public int width;
    public int height;
    public int x;
    public int y;

    public Rectangle(int width, int height ,int x , int y){
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public String getRectangle(){
        return "[width:"+this.width+",heghit:"+this.height+",x:"+this.x+",y:"+this.y+"]";
    }

}
