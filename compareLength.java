package ExpressionsAndControlFlow;

public class compareLength {
    public static void main(String[] args) {

        // - Create an array variable named `firstArrayOfNumbers`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `secondArrayOfNumbers`
        //   with the following content: `[4, 5]`
        // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
        //   elements than `firstArrayOfNumbers`
        // - Otherwise print: "firstArrayOfNumbers is the longer one"

        int[] firstArrayOfNumbers = new int[]{1, 2, 3};
        int[] secondArrayOfNumbers = new int[]{4, 5};
        if (secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
            System.out.println("Second Array is not longer than first one!");
        } else {
            System.out.println("First one Array is longer than second one!");
        }
    }
}
