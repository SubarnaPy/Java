public class Array1 {
    public static int linearSarch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String args[]) {
        System.out.println("hello");
        int arr[] = { 4, 5, 6, 7, 2, 9 };
        int key = 7;
        int index = linearSarch(arr, key);
        System.out.println(index);
    }
}