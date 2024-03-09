package plandromic;

public class Approch1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1 };
        int size = arr.length;
        int copyArr[] = new int[size];
        System.out.println("ok");
        int x = 0;
        for (int i = 0; i < size; i++) {
            copyArr[i] = arr[(size - 1) - i];
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] != copyArr[i]) {
                System.out.println("not a palindrom array");
                x = 1;
                break;
            }
        }
        if (x != 1) {
            System.out.println("palindrom");
        }
    }
}