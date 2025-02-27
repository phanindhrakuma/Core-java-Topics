enum Status{
    running, sucesses , reading, working;
}
public class whatisenum {
    public static void main(String[] args) {
        Status a = Status.reading; // status is the type if a
        System.out.println(a); 
        System.out.println(a.ordinal()); // it print the index value if the status 
        Status []b = Status.values(); // values are type array that is the reason we mension b[] array
        for(Status z : b){
            System.out.println(z+"  "+z.ordinal()); // printing the vules using enhanced for loop
        }


        Status s = Status.sucesses;

        // comparing using te switch case
        switch (s) {
            case sucesses:
            System.out.println("Please Wait");
                break;
            case running:
            System.out.println("All Good");
                break;
            case reading:
            System.out.println("Try Again");
                break;    
            default:
            System.out.println("Done");
                break;
        }

        // comparing the emoun using if else 
        if(s==Status.running)
    		System.out.println("All Good");
    	else if(s==Status.reading)
    		System.out.println("Try Again");
    	else if ( s==Status.sucesses)
    		System.out.println("Please Wait");
    	else
    		System.out.println("Done");
    	
    }
}
// we cant extend enum is a class but we camt entend
