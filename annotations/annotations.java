//@Deprecated
class A
{
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in show A");
	}
}

class B extends A 
{
	@Override  // thsi is annotation and we can use this @Override so it will tells weathc the name of the
    //method of class A is same and name of the class B is same (showTheDataWhichBelongsToThisClass)
//	public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass()

	{
		System.out.println("in show B");
	}
}

public class annotations {
    public static void main(String[] args) {
    	
    	B obj=new B();
    	obj.showTheDataWhichBelongsToThisClass();
    	
    }
}