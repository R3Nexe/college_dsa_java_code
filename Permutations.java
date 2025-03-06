
public class a1q4_recursion {

    // Recursive function to generate permutations
    private static void permute(char[] arr, int l, int r) {
        if (l == r) {
            System.out.println(new String(arr));
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);         // Swap to fix one character at index l
                permute(arr, l + 1, r);    // Permute the remaining characters
                swap(arr, l, i);         // Backtrack to restore the original array
            }
        }
    }

    // Helper method to swap two characters in the array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        char[] arr = {'c', 'a', 'r'};
        permute(arr, 0, arr.length - 1);
    }
}
