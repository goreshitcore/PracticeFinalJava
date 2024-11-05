public class Rectangle  {

    private int height;
    private int width;

    Rectangle( int width, int height){
        
        this.width = width;
        this.height = height;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    

    public String toString() {
        
            return "width = " +width + "\nheight = " +height;
        
    }


}
