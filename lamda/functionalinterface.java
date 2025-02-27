@FunctionalInterface // functional interface means having only one method in it 
interface A
{
	void show();
//	void run();
}
@FunctionalInterface
interface B{
    void show1(int i);
}
@FunctionalInterface
interface C{
    int add(int i, int j);
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class functionalinterface {
    public static void main(String[] args) {
    	
    	A obj=new A()
    	{    	
    		public void show()
    		{
    			System.out.println("in Show");
    		}
    	};
        A obj1= ()-> // using lamda expression -> decreasing the code the above code by 
        //using the lamda we decteased the limes the below are the lines we decreased 
        /*new A()
    	{    	
    		public void show
        } */
    		{
    			System.out.println("in Show using lamda and with flower brackets ");
    		}
    	;
        A obj2 =() ->System.out.println("in Show lamda"); // using lamda we decrease the cpde like this 
        /*new A()
    	{    	
    		public void show()
    		{
    			
    		}
    	}; */ 
        // the above is the code we deleted to make the code less 
        B obj3 = new B() {
            public void show1(int i){
                System.out.println("in show1   "+i*5);
            }
        };
        B obj4 = (i)->System.out.println("in show1  lamda  "+i*5); // using lamda function
        /*new A()
    	{    	
    		public void show()
    		{
    			
    		}
    	}; */ 
        // the above is the code we deleted to make the code less 
        C obj5 = new C() {
            public int add(int i, int j){
                return i+j;
            }
        };
        C obj6 = (i,j)->{ // using lamda and flower brackets 
                return i+j; // note : if we have morethen 1 statements we have to use flower brackets 
                //if we have only 1 statement inside the flower brackets we ca remove those lines and  make the code in 1 line like below
            };
            C obj7 = (int i, int j) ->  i+j; // we we have return we have to remove that (return)in lamda like this  
                
 //   	A obj=new A();
 //   	A obj=new B();
    	obj.show();
        obj1.show();
        obj2.show();
        obj3.show1(5);
        obj4.show1(10);
        int result = obj5.add(5,6);
        System.out.println(result);
        int r1 = obj6.add(3,3);
        System.out.println("using lamda flower bracket   "+ r1);
        int r2 = obj7.add(4,6);
        System.out.println("in lamda removing the retur n and flower brackets "+ r2);

    }
}
// lamda expression is only works when functional interfece 