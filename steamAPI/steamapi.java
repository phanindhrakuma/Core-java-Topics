import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class steamapi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,4,3,16,18); // it is the arrays list we can directly add the values without using add 
        System.out.println(nums+" it is the normal list ");
        int sum=0;
        for(int n : nums ){
            if(n%2==0){
                n=n*2;
                sum = sum +n;
            }
        }
        System.out.println(sum +" the sum values of even double ");
        System.out.println();

        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i)+"   using get method ");
        }
        System.out.println();

        for(int n: nums){
            System.out.println(n+ "  the enhanced for loop ");
        }
        System.out.println();

        nums.forEach(n -> System.out.println(n+"    using for each "));   // using for eact method 

        //stream API

        // Stream<Integer> s1 = nums.stream(); //we can create the stream like this instead of working with the original dat we can assign those to the stream 
        // Stream<Integer> s2  = s1.filter(n -> n%2==0); // filetering with even number 
        // Stream<Integer> s3 = s2.map(n -> n*2);  // doubling the value s1.map/filter will gives the o/p strean that is the reason we are using (Stream <Integer >)
        // int result = s3.reduce(0, (c,e) -> c+e);

        // instead of above we can use the stream like this 

       int result =  nums.stream()
                        .filter(n -> n%2==0)
                        .map(n ->n*2)
                        .reduce(0, (c,e)-> c+e);


        // System.out.println(s1+ " usaing stream ");  // we can peint the stream but we cannot print twice 
        // System.out.println(s1+ " usaing stream ");   // theis statement isnot works stream will not suppoert to print again \

        // s1.forEach(n -> System.out.println(n+"      stream foreach method "));  

        // s2.forEach(n -> System.out.println(n+"      stream foreach method  s2 "));
        // s3.forEach(n -> System.out.println(n+"    strea for s3 doubles "));


        System.out.println(result+"   using modified stream ");

        Stream<Integer> sor =  nums.parallelStream()  // parellel stream used for multiple filters 
                        .filter(n -> n%2==0)
                        .map(n ->n*2)
                        .sorted();
        sor.forEach(n -> System.out.println(n));  // it will sorted 




    }
}
