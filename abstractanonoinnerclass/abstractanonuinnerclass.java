abstract class A{
    public abstract void show();
    public abstract void show1();
}

public class abstractanonuinnerclass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(){
                System.out.println("in new show "); // can use the anonomus inner class for abstract also 
            }
            public void show1(){
                System.out.println(" in show1"); // we can write multiple also
            }
        };
        obj.show();
        obj.show1();
    }
}
