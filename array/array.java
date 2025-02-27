public class array {
    public static void main(String[] args) {
        int arr[] = {5,3,6,7}; // initiating an array without size
        arr[0] = 66; // changing the value of an array
        System.out.println(arr[0]); /// printing the value of an array
        int /*interger tuype array  */ arr1 /*array name (arr1) */ [] = new int[3] /*size of an array  */ ;
        arr1[0] = 5;
        arr1[1] = 6; // assigning the values of an array
        arr1[2] = 7;
        for(int i=0;i<arr1.length;i++){  // printing the values of an array using for loop 
            System.out.println(arr1[i]);
        }

    }
}
