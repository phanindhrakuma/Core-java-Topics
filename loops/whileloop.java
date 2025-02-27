public class whileloop {
    public static void main(String []args){
        int i=0;
        while(i<5){ // if the condition is true it will execute continously
            System.out.println("hello"+i);
            int j=0;
            while(j<3){
                System.out.println("hi");
                j++;
            }
            i++;
        }
    }
}
