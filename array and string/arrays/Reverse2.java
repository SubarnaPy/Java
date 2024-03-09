public class Reverse2 {
    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 66, 77, 33, 9 };
        reverse(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
