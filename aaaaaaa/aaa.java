package aaaaaaa;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class aaa {
    public static void main(String[] args) {
        Map<String , Integer> students = new HashMap<>();
        /*String is the typ of key names of the values instead of index values */ /*Integer is the value type  */ 
        students.put("phani", 5);
        students.put("phanindhra", 65);
        students.put("kumar", 95);
        students.put("phanikumar", 99);
        students.put("phani", 55);
        // if have any same keyword it will take only highest values key only 
        //  mao will not print the same key the key must be uique
        System.out.println(students); // print all the key and value like a array 
        System.out.println(students.get("kumar"));  // print the value of the key
        System.out.println(students.keySet());  // this will print only key values 

        for(String key : students.keySet()){  // printing the key values type string with those we get the data values 
            System.out.println(key+"   :   "+students.get(key)+" hashMap");
        }

        System.out.println();


        Map<String , Integer> student = new Hashtable<>();  // when you use synchronize and threads use Hashtable 
        student.put("phani", 5);
        student.put("phanindhra", 65);
        student.put("kumar", 95);
        student.put("phanikumar", 99);
        student.put("phani", 55);
        // if have any same keyword it will take only highest values key only 
        //  mao will not print the same key the key must be uique
        System.out.println(student); // print all the key and value like a array 
        System.out.println(student.get("kumar"));  // print the value of the key
        System.out.println(student.keySet());  // this will print only key values 

        for(String key : student.keySet()){  // printing the key values type string with those we get the data values 
            System.out.println(key+"   :   "+student.get(key)+"  HashTable");
        }
    }
}
