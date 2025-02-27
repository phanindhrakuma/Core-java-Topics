class A{
    public void show(){
        System.out.println("in A show");
    }
}

public class anonumusinnerclass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in new show"); // we craete the another method ishod the object creation  
                //there is no class name this is called anonumus inner class 
            }
        };
        obj.show();
    }
}
