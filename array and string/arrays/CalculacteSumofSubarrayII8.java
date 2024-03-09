public class CalculacteSumofSubarrayII8 {
    public static void calculate(int arr[]) {
        int max = Integer.MIN_VALUE;
        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];

        // if arr is 1,2,3 prefix array is 1,(1+2),(1+2+3)
        for (int i = 1; i < arr.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];

        }
        int currentMax;
        for (int n = 0; n < arr.length; n++) {
            currentMax = 0;
            for (int m = n; m < arr.length; m++) {
                currentMax = n == 0 ? prefixArray[m] : prefixArray[m] - prefixArray[n - 1];
                if (currentMax > max) {
                    max = currentMax;
                }
                System.out.print(currentMax);

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
