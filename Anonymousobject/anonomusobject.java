class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}
public class anonomusobject {
    public static void main(String[] args) {
        {
            int marks;
            marks=99;
            
            new A();   //anonymous object
            new A().show();
            
    //		A obj=new A();
            A obj;
            obj=new A();
            
            obj.show();
        }
    }
}
