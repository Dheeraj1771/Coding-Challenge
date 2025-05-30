// Day 31: Data Structure and Algorithms: LeetCode 832. Flipping an Image
public class day31ds_02 {
    public void reverse(int[][] image, int start, int end, int i) {
        while (start < end) {
            int temp = image[i][start];
            image[i][start] = image[i][end];
            image[i][end] = temp;
            start++;
            end--;
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            reverse(image, 0, image.length - 1, i);
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] ^= 1;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        day31ds_02 obj = new day31ds_02();
        int[][] images = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] result = obj.flipAndInvertImage(images);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");
    }
}
