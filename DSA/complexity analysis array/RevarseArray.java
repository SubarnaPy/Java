public class RevarseArray {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 6, 99, 32, 67, 44, 90 };
        int size = arr.length;
        int mid = size / 2;
        for (int i = 0; i < mid; i++) {
            // swap arr[i]and arr[size-1-i]
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
