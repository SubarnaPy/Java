public class Subarray5 {
    public static void calculate(int arr[]) {
        for (int n = 0; n < arr.length; n++) {

            for (int m = n; m < arr.length; m++) {
                for (int k = n; k <= m; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.println();
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 9, 7, 8, 33, 44 };
        calculate(arr);
    }
}
