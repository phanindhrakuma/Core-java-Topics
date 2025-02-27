/*final*/ class A{ // if we use final key in class this call is not extends 
    public final void show(){  // we can use final in methods also so no one can use our methods 
        System.out.println("in show ");
    }
} 
class B extends A{ // beacause we are using this final to class A so we are unable to extend that class 
    public void show(){
        System.out.println("in show class B");
    }
    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }
}
public class finalkeyboard {
    public static void main(String[] args) {
        final int num = 8;
        //num = 9; //it will not change it gives error because use assign the number using final keyword 
        System.out.println(num);
        A obj = new A();
        obj.show();
    }
}
//final - class , method , veriable 
