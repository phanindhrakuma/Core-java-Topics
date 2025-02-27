import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sotinglist {
    public static void main(String[] args) {


        Comparator<Integer> com=new Comparator<Integer>()
        {
            public int compare(Integer i,Integer j)
            {
                if(i%10 >j%10)
                    return 1;
                else
                    return -1;
            }
        };	
        List<Integer> list = new ArrayList<Integer>();


        list.add(31);
        list.add(35);
        list.add(54);
        list.add(82);
        list.add(63);
        // Collections.sort(list);

        System.out.println(list+"before sorthing ");
        Collections.sort(list,com);  // help yo sort the list using Collections
        System.out.println(list+" arter sorting the list ");  
        
    }
}
