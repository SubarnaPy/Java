public class CalculateSumofSubarray7 {
    public static void calculate(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int n = 0; n < arr.length; n++) {
            for (int m = n; m < arr.length; m++) {
                currentMax = 0;
                for (int k = n; k <= m; k++) {
                    currentMax += arr[k];
                    System.out.print(currentMax + " ");
                    if (currentMax > max) {
                        max = currentMax;
                    }

                }
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("maximum sub array sum is: " + max);

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        calculate(arr);
    }
}
