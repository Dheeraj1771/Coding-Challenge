// Day 40: Data Structure and Algorithms: LeetCode 796. Rotate String
public class day40ds_02 {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String rotated = s;
        for(int i=0; i<s.length(); i++) {
            String start = rotated.substring(0,1);
            String end  = rotated.substring(1);
            rotated = end + start;
            if(rotated.equals(goal)) {
                return true;
            } 
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        day40ds_02 obj = new day40ds_02();
        System.out.println(obj.rotateString(s, goal));
    }
}
