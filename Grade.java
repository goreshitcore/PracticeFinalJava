import java.util.Arrays;
public class Grade implements Comparable<Grade>{
	public Character letter;

    public Grade() {
        this.letter = letter;
    }
    
        @Override
        //compares to strings Lexicographically so grade g1 and g2
    public int compareTo(Grade o) {
        return this.letter.compareTo(o.letter);
    }

    public static void main(String[] args) {
        Grade g1 = new Grade();
        g1.letter ='A';
        Grade g2 = new Grade();
        g2.letter ='B';
        System.out.println(g1.compareTo(g2));
    }
}
