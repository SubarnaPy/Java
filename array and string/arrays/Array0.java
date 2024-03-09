class Array0 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 45, 5, 6 };
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();
        int b[][] = { { 1, 2, 3, 4, 5 }, { 34, 67, 8, 1 }, { 55, 6, 7 } };
        for (int c[] : b) {
            for (int d : c) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}