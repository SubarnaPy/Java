public class TrappingRainwater {
    public static int trappingRainwater(int arr[]) {
        // left max boundary
        int maxLaft[] = new int[arr.length];
        maxLaft[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxLaft[i] = Math.max(arr[i], maxLaft[i - 1]);
        }
        // right max boundary
        int maxRight[] = new int[arr.length];
        maxRight[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(arr[i], maxRight[i + 1]);
        }
        int trapwater = 0;
        for (int i = 0; i < arr.length; i++) {
            // min of left and right
            int waterLavel = Math.min(maxLaft[i], maxRight[i]);
            // water lavel
            trapwater += waterLavel - arr[i];
        }
        return trapwater;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 2, 0, 4 };
        int trappedwater = trappingRainwater(arr);
        System.out.println(trappedwater);
    }

}
