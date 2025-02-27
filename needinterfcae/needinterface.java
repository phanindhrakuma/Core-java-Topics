 /* abstract class */ interface computer{ // because the method is abstract we have to make class is also abstract
    //insteadof abstract class we use interface
    /* public void code(){

    } */
   // the above the code is not usinh we make that as abstrace
   /* public  abstract*/  void code(); 
}
class Laptop  /*extends */implements computer{ //instead of extends we use implements 
    public void code(){
        System.out.println("code, compile , run");
    }
}
class Desktop  /* extends*/implements computer{//instead of extends we use implements 
    public void code(){
        System.out.println("code, compile, run : faster");
    }
}
class Developer{
    public void Devcode(computer lap){ //accepting the object lap
        lap.code();  // calling the method
    }
}
public class needinterface {
    public static void main(String[] args) {
        computer lap = new Laptop(); // type computer object is different class 
        computer desk = new Desktop();// type computer object is different class 
        Developer dev = new Developer();  // creating the objecti for thr Developer class 
        dev.Devcode(lap); // semding the lap class obj to the developer class 
        dev.Devcode(desk); // semding the desk class obj to the developer class 
    }
}
// interface  fot abstract and implements  for extendsd are used 
