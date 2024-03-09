public class Pairs3 {

    public static void calculate(int arr[]) {
        for (int n = 0; n < arr.length; n++) {
            int num = arr[n];
            for (int m = n + 1; m < arr.length; m++) {
                int num1 = arr[m];
                System.out.print("(" + num + "," + num1 + ")");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 9, 7, 8, 33, 44 };
        calculate(arr);
    }
}
