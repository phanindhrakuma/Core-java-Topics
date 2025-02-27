public class boxing {
    public static void main(String[] args) {
        int num = 8;
        Integer num1 = num; //Interger is a object we are assigning the value num in that object that is called autoboxing ;
        int num2 = num1.intValue(); //unboxing
        // the above the num1 is the object we are assigning to int (premetive ) to conver the object
        // to the premetive we are using the (num1.intValue();)
        System.out.println(num2); 
        int num3=num1;  // the befault in background it will convert to object to premetive (int) called  #auto unboxing
        System.out.println(num3);
        String str= "12";
        int n = Integer.parseInt(str); // convering the string to integer 
        System.out.println(n*2);

    }
}
// autoboxing means we are assigning the premetiive value(int) to object 
// quto unboxing  mens we are taking out the object value to the premetive value (int)