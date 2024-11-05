public class Media {
    
private String title;

public Media(String title) {
    this.title = title;
}
public String getTitle()  {
    return title;
}
public String toString() {
    return "title = " + title; 
}

public static void main(String[] args) {
    Media media = new Media("Title");
        System.out.println(media);
}

}
