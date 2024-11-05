import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList1 {



    ArrayList<Integer> list = new ArrayList<>();//new list for even numbers
    public ArrayList<Integer> removeOdd(ArrayList<Integer> numbers) //arraylist method
	{
        for (Integer n : numbers) {
            if ( n % 2 == 0) {
                list.add(n);
            }
        }
        return list;
	}
}
