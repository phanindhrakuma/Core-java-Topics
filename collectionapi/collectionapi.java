import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collectionapi {
    public static void main(String[] args) {
        Collection/*collection is the object API*/<Integer>/*<Integer is the type of elements>*/ nums = new ArrayList<Integer>/*<Integer is the type of elements>*/();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        System.out.println(nums+"array list"); // we can directly print the values in the list without for loop 

        for(Integer n : nums){
            System.out.println(n +" enhanced for loop"); // using enhanced for loop printing one by one
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(list.get(0)+"   index value element in list");
        System.out.println(list.indexOf(6)+"   index value of element");

        Set<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(5);
        set.add(5);
        set.add(8);  
        // hasgset will remove the duplicate elements 


        for(Integer n : set){
            System.out.println(n +" enhanced for loop hash set"); // using enhanced for loop printing one by one
        }

        Set<Integer> treeset = new TreeSet<Integer>();
        // Collection<Integer> treeset = new TreeSet<Integer>(); // we can use Collection instead of set because it implements set 
        treeset.add(100);
        treeset.add(54);
        treeset.add(5);
        treeset.add(58);
        treeset.add(88);
        treeset.add(100);

        // the tree set will sort the values 

        for(Integer n : treeset){
            System.out.println(n +" enhanced for loop tree set"); // using enhanced for loop printing one by one
        }


        // w can use iterator instead of for loop like below 
        Iterator<Integer> values = treeset.iterator();
        while(values.hasNext()){
            System.out.println(values.next()+" in iterator hasNext"); // values.next() print the next element  
        }
        
    }
}
/*colllection API = means belongs to API
 * Collection = interface
 * Collections = class    
 * all three are differect
 */