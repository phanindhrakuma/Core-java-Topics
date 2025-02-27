// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A{
    int age = 55;
    String area = "warangal"; // bydefault these values are static and final that is why we use a.area
    void show();  // bt default it like (public abstract void show();)
    void config();// bt default it like (public abstract void show();)
}
interface B {
    void run();
}
interface C extends B{// interface - interface -> extends

}
class D implements A,C{// class - interface -> implements
    public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
    public void run(){
        System.out.println("running.");
    }
}
public class needofnterface {
    public static void main(String[] args) {
        A obj = new D();
        obj.show();
        obj.config();
        B obj1 = new D();
        obj1.run();
        System.out.println(A.area);
    }
}
// interfaces are threee types 
/* 1st: normal  means having the normal methods in the class 
 * 2nd: SAM/ fucnctionsal SAM : single abstract method // means we use abstract in that class 
 * 3rd: marker // means in this class no methods 
 */