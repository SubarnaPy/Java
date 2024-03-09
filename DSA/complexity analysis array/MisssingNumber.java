public class MisssingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
        int size = arr.length;
        int maxnum = size + 1;
        System.out.println("max number in the array ia: " + maxnum);
        int sum = (maxnum * (maxnum + 1)) / 2;
        System.out.println("total sum: " + sum);
        int arraysum = 0;
        for (int n : arr) {
            arraysum += n;
        }
        System.out.println("total array sum: " + arraysum);
        System.out.println("Missing number is: " + (sum - arraysum));
    }
}
