// Day 32: Data Structure and Algorithms: LeetCode 48. Rotate Image
public class day32ds_02 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) { // Count of Rings
            for (int j = 0; j < n / 2; j++) { // Each element in the Ring
                // 4-Way Swap
                int temp = matrix[n - 1 - j][i]; // bottom left

                // bottom left = bottom right
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];

                // bottom right = top right
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];

                // top right = top left
                matrix[j][n - 1 - i] = matrix[i][j];

                // top left = temp
                matrix[i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        day32ds_02 obj = new day32ds_02();
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        obj.rotate(mat);
        System.out.print("[");
        for (int i = 0; i < mat.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}
