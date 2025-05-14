import java.text.Format;
import java.util.Arrays;
import java.text.Format;

class SortArgs {
    public static void sort(String[] args) {
        // create a array of integers of size args.length
        Integer[] integers = new Integer[args.length];

        // convert the array of strings to integers and store them in the array of integers
        for (int i = 0; i < args.length; i++) {
            integers[i] = Integer.parseInt(args[i]);
        }

        // sort the array of strings using Arrays.sort
        Arrays.sort(integers);

        // print the sorted array and make sure not print a space after the last number
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            if (i != integers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
