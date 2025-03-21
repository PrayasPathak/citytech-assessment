/**
 * Problem Statement:
 * Write a program to calculate the total inversion of an array.
 * The inversion of an array is defined as a pair of indices for which i < j and array[i] > array[j].
 *
 * <br/>
 * @param: Array
 * @return: int
 */
public class InversionCount {
    static int countInversions(int[] arr) {
        int n = arr.length;
        int invCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        System.out.println("Total inversions in the array: " + countInversions(arr));
        int[] numbers = {1, 2, 5, 3, 60, 10};
        System.out.println("Total inversions in the array: " + countInversions(numbers));
    }
}
