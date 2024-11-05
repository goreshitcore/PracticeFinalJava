import java.util.ArrayList;
import java.util.Collection;

public class MyListDouble {
    
        public ArrayList<Double> merge(ArrayList<Double> list1,ArrayList<Double> list2)
        {        
            ArrayList<Double> merge = new ArrayList<>();

            merge.addAll(list1);
            

            for (Double e : list1) {
                if(!merge.contains(e)) {
                    merge.add(e);
                }
            }

            for (Double e : list2) {
                if(!merge.contains(e)) {
                    merge.add(e);
                }
            }
        return merge;
    }
    
    public static void main(String[] args) {
        ArrayList<Double> doubleList2 = new ArrayList<>();
        doubleList2.add(1.5);
        doubleList2.add(2.7);
        
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);    
        doubleList.add(2.7);
        MyListDouble dl = new MyListDouble();
        System.out.println(dl.merge(doubleList,doubleList2));
    }


}

