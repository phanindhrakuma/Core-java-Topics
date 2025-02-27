// Polymorphism means many behaviours 
// two types 1: compile time 2: runtime
//overloading is the example for complie time means it change the behaviour in compile time 
//overriding is the example for complie time means it change the behaviour in runtime
// the below is the Dynamic Method Dispatch  by using this we explaining the Polymorphism 
class Computer{
    public void show(){
        System.out.println("i am a computer");
    }
}
class Laptop extends Computer{
    public void show(){
        System.out.println("i am a Laptop"); // overriding
    }
}
class Pc extends Computer{
    public void show(){
        System.out.println("i am a PC");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Computer obj = new Computer(); 
        obj.show();
        obj = new Laptop();
        obj.show();
        // means the laptop is a computer also 
        // we are using here the obj is type computer and we are calling the method laptop
        obj = new Pc(); // here the obj is the type computer but we are using the method PC
        obj.show();
        // in all these three methods the type is same but the outputs (belaviours ) are different thsi si called Polymorphism
        // this is called dynamic method dispatch 
        // note : we we want to use the type of object computer the remaining class must be extends Computer then we can
        // call other methods using the type as computer // extends computer is important
        // it works only inhertance 
        
    }
}
