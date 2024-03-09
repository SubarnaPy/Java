package plandromic;

public class Apprach2 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 7, 6, 5, 2 };
        int size = arr.length;
        int mid = size / 2;
        int check = 0;
        for (int i = 0; i < mid; i++) {
            if (arr[i] != arr[size - 1 - i]) {
                check = 1;
                System.out.println("not a palindrom");
                break;
            }
        }
        if (check != 1) {
            System.out.println("it is a palindrom array");
        }
    }

}
