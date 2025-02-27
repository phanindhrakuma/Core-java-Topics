public class exceptions {
    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int i=2;
        int j=0;
        String str = null;
        /* j=18/i; */  // we can the error exception because of that the will not execute 
        //remaining print statements " completed " the code stop execution to solve that 
        //issue we use try catch excueption handling liekl below
        
        int arr[] = new int[5];
        // the below is the exception handling code using try catch method if 
        //we use this the compiler  try this if we hjave an exception it tells to us and it will not stop the execution of the code  
        try
        {
            j=18/i;
            System.out.println(str.length());
            System.out.println(arr[5]); // here it is out of length of an array 0,1,2,3,4 total 5 
            //means arr[4] is last element in array there is no arr[5] elememt
            
        }
        catch(ArithmeticException e){ // compilr throw the exception we catch it using catch (Arthmetic Exception e) 
            // "e" is save the error and store it in e used  to find the issue of that block
            System.out.println(" the exception issue " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){ // wecan write multiple statements in try but we have to 
            //catch those arrording to the exception type
            System.out.println("array index value is lessthen the length of the value ");
        }
        catch(Exception e){
            System.out.println(" something went wrong "+ e);
        }
        System.out.println(j);
        System.out.println("completed ");
    }
}
/*errors 1: compile time error  = showed by trhe compiler 
2: run time errors means the code will stop in the middle this is called runtine error so we use exceptions in runtine errors 
3 : logical error measn mistaking from our end in logicals  */ 


// note : always make the (Exception e ) lest because it is  the parent class 