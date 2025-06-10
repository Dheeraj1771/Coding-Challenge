// Day 42: Data Structure and Algorithms: LeetCode 151. Reverse Words in a String
public class day42ds_02 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {
                sb.append(arr[i] + " ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        day42ds_02 obj = new day42ds_02();
        System.out.println(obj.reverseWords(s));
    }
}
