package strings;

public class Gatesortestpath {
    public static float sortestpath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char direction = str.charAt(i);
            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'E') {
                x++;
            } else if (direction == 'W') {
                x--;
            }

        }
        int X1 = x * x;
        int Y1 = y * y;
        float mul = (float) Math.sqrt(X1 + Y1);
        return mul;
    }

    public static void main(String[] args) {
        String str = "WENSE";
        System.out.println(sortestpath(str));
    }

}
