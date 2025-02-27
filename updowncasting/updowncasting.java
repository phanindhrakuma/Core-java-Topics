class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show1(){
        System.out.println("in B show1");
    }
}
public class updowncasting {
    public static void main(String[] args) {
        A obj = new B(); // by default in background it is like (A obj = (A) new B(); we can written this as A obj = new B(); it is aclled upcasting)
        obj.show();
        B obj1 = (B)obj; // downcasting 
        obj1.show1();
        // the above the ovbj is the type A but in the above line if we write B obj1 = obj; it shows error because by default
        //B obj1 = obj;  is like B obj1 = (A)obj; so we to change that while downcasting we will write  B obj1 = (B)obj;
    }
    
}
