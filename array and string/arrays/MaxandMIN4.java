public class MaxandMIN4 {
    public static void maxmin(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            if (max < n) {
                max = n;
            } else if (min > n) {
                min = n;
            }
        }
        System.out.println("max valu :" + max);
        System.out.println("min value :" + min);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 28, 55, 33, 66, 113, 3, -123 };
        maxmin(arr);
    }

}
