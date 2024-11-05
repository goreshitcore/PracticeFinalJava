import java.util.ArrayList;



public class MyList {

    public  ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
        ArrayList<Integer> result = new ArrayList<>();

        if ( list1.isEmpty() || list2.isEmpty() ) {
            return result;
        }

        for (Integer element : list1) {
            if (list2.contains(element) && !result.contains(element)) {
                result.add(element);
            }
        }

        return result;  
	}

    

    public static void main(String[] args) {
        MyList q = new MyList();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(-4);list2.add(-56);list2.add(500);list2.add(3);
		System.out.println(q.intersection(list1, list2));
    }



    public char[] removeOdd(ArrayList<Integer> list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeOdd'");
    }



    public char[] merge(ArrayList<Double> doubleList, ArrayList<Double> doubleList2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'merge'");
    }



    public void sort(ArrayList<String> words) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }

}
