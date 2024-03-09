public class KadansALgoForFindingMaximumSUBarraySum9 {
    public static void calculate(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int n = 0; n < arr.length; n++) {
            currentMax += arr[n];
            if (currentMax < 0) {
                currentMax = 0;
            }
            max = Math.max(currentMax, max);

        }
        System.out.println("maximum sub array sum is: " + max);

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        calculate(arr);
    }
}
