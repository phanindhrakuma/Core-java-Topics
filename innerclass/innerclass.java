class A{
    int age;
    public void show(){
        System.out.println("in A");
    }
    class B{
        public void show2(){
            System.out.println("in B");
        }
    }
    static class C{
        public void show3(){
            System.out.println("in c");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();  // creating trhe object for inner class for that we have 
        //to create the obj and by using obj we have to create the obj1
        obj1.show2();
        A.C obj2 = new  A.C(); // we can create the obj3 directly when that inner class is static class c
        obj2.show3();
    }
}
