package demo2.plain_java;

public class Test3 {

    public static void main(String[] args) {

        //question57();
        question56();
    }

    private static void question56() {

        char[][] grid = new char[3][3];
        grid[1][1] = 'x';
        grid[0][0] = 'o';
        grid[2][1] = 'x';
        grid[0][1] = 'o';
        grid[2][2] = 'x';
        grid[1][2] = 'o';

        // odgovor
        grid[2][0] = 'x';

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    private static void question57() {
        int nums1[] = new int[3];
        int nums2[] = {1, 2, 3, 4, 5};
        nums1 = nums2;

        for (int x : nums1) {
            System.out.println(x + ":");
        }
    }
}
