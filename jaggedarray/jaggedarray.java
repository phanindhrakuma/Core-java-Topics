public class jaggedarray {
    public static void main(String[] args) {
        int arr[][] = new int[3] /*row */ [] /*we dony know the how many columns */ ;
        // jaged array means we dont knwo how many values are there in an array 
        arr[0] = new int [3]; // we have to mension the length of columns # 3 
        arr[1] = new int [4]; // we have to mension the length of columns # 4 
        arr[2] = new int [2]; // we have to mension the length of columns # 2
        
        for(int i=0;i<arr.length;i++){  // rows of an array 
            for(int j=0;j<arr[i].length;j++){ // columns of an array 
                arr[i][j] = (int)(Math.random()*100);
                // Math.random() is a function print random values from 0 to 1 
                //it gives the output in double that is the reason we are type cating it 
            }
        }
        for(int /*integer array */ n[] /* pulling first column from arr*/ : arr /* array name*/ ){
            for(int /*integer array */ m /* pulling first value from n[]array */: n /*array name a[] */){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
