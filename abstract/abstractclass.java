abstract class Car{   // if we use abstract we have to make class as abstract 
    public abstract void drive(); // we knwo this method it is available in car  but we dont know what to do in 
    //this method in futire someone came and write the code for this drive method for that we can use abstract 
    // for that we make that metod abstract and class also abstract that only it works 
    public abstract void fly(); // we can use multiple absracts
    public abstract void speed(); // in future some peoples will write the code now we are not writing it 
    //it shows error if we are not performing or writing the code of  all the abstracts 
    //we have to make our another class as abstrace like like number  1
    public void Music(){
        System.out.println("plating music");
    }
}
abstract class Bmw extends Car{ // inhertance 
    // the above we are using the abstract before the class Bmw because we are not performing the all abstract 
    // methods in the Car class means (fly) so we will use extends in class Bmw some one writes the code for speed in future 
    public void drive(){ // method overriding
        System.out.println("i can drive the car"); // here another programmer write teh code for drive 
    }
    public void fly(){ // method overriding
        System.out.println("i can fly"); // here another programmer write teh code for drive 
    }
}
class updated extends Bmw{ // concrate class 
    public void speed (){
        System.out.println(" i can speed ");
    }
}
public class abstractclass {
 
    public static void main(String[] args) {
        Car obj = new updated();
        obj.drive();
        obj.Music();
        obj.fly();
        obj.speed();
    }
}
// note : the abstract class having normal executeings and abstract executing but
// the abstract method must be inside the abstract class 