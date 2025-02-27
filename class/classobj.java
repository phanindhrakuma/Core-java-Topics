class calculater{   // additional class 
    public int /*return type integer*/ add /*onject name (add) */ (int n1,int n2){
        int r = n1+n2;
        return r; //return java
    }
}

public class classobj {
    public static void main(String []args){
        int num1 =5;
        int num2 =4;
        calculater calc = new calculater(); // importing the calculater calss 
        int result = calc.add(num1,num2); //sending the values to the calculater class 
        System.out.println(result); // printing the result 
    }   
}
