public class multiarray {
    /*|        --------> columns 
      |
      |
      rows
      */
    public static void main(String[] args) {
        int arr[][] = new int[3] /*row */ [4] /*column */ ; 
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j] = (int)(Math.random()*100);
                // Math.random() is a function print random values from 0 to 1 
                //it gives the output in double that is the reason we are type cating it 
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
}
