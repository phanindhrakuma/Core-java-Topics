class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}
class AdvCalc extends Calc{ 
    public int add(int n1,int n2){ // the second class method is works bcause it prefer this method first 
        // method overriding means the method name and inputs and return are same 
        //it prefer the object we created in the main class and execute first 
        return n1+n2+1;
    }
}
public class methodoverriding{
	public static void main(String args[])
	{
        AdvCalc obj= new AdvCalc();
        int res = obj.add(5, 5);
        System.out.println(res);
	}
}