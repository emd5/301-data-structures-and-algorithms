import java.util.Arrays;

/**
 * The type Array reverse.
 */
public class ArrayReverse {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main (String[] args) {
        // create the array to test your code on later
        int[] startArr = new int[] {1,2,3,4,5,10};
        // print it out, nicely
        System.out.println(Arrays.toString(startArr));
        // call your reverseArray method and save the result in a variable
        int[] endArr = reverseArray(startArr);
        // print out the result, nicely
        System.out.println(Arrays.toString(endArr));
    }


    /**
     * Reverse array int [ ].
     *
     * @param inputArray the input array
     * @return the int [ ]
     */
    public static int[] reverseArray(int[] inputArray) {

        // when array is empty or has less than one index in array
        if(inputArray ==null || inputArray.length <= 1){
            return inputArray;
        }

        for(int i=0; i< inputArray.length/2; i++){
            int temp = inputArray[i];
            inputArray[i] = inputArray[(inputArray.length - 1) - i];
            inputArray[(inputArray.length - 1) - i] = temp;
        }

        System.out.println("New Array is:");

        return inputArray;
    }

}