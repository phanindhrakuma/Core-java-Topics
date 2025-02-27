public class enhancedforloop {
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
        System.out.println();
        //enhanced for loop 
        for(int /*integer array */ n[] /* pulling first column from arr*/ : arr /* array name*/ ){
            for(int /*integer array */ m /* pulling first value from n[]array */: n /*array name a[] */){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
    }
}
