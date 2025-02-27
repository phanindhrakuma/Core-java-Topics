class PhaniException extends Exception{
    public PhaniException(String name){
        super(name); // we are sending this string value to the Exception
    }
} 
public class throwexception {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;  // 18/20 = 0 i dont want zeror so i throw the output 0 (ArithmeticException) that is catched by catch
            // if(j==0){ 
            //     throw new ArithmeticException( " i dont want to print zero"); // we can display the message we want 
            //     // instead of Arthemetic exprerssionw we can use phaniException also like we hae to create a class named 
            //     // phaniException and create a method which accept the string to display the message 
            // }
            if(j==0){
                throw new PhaniException("this is phani exception zero");
            }
        }catch(ArithmeticException e){
            j=18/1; // the i=0 instead of exception we can ahndle it and devide with one 
            System.out.println(" this is the default  "+e);
        }
        catch(PhaniException e){
            System.out.println(" catch phani exception "+e);
        }
        catch(Exception e){
            System.out.println("something went wrong" + e );
        }
        System.out.println(j);
        System.out.println("completed ");

    }
}
