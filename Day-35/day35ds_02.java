// Day 35: Data Structure and Algorithms: LeetCode 434. Number of Segments in a String
public class day35ds_02 {
    public int countSegments(String s) {
        int count = 0;
        String arr[] = s.split(" ");
        for (String c : arr) {
            if (!c.isEmpty()) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        day35ds_02 obj = new day35ds_02();
        System.out.println(obj.countSegments("Hello, my name is John"));
    }
}
