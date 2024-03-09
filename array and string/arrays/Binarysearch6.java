public class Binarysearch6 {
    public static int search(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 9, 12, 14, 67, 89, 123, 456 };
        int key = 89;
        int index = search(arr, key);
        if (index == -1) {
            System.out.println("element not present");
        } else {
            System.out.println("element present at index  " + index);
        }
    }

}
