public class day34ds_02 {
    public int lengthOfLastWord(String s) {
        int size = 0;
        int i = s.length() - 1;
        while(i >= 0 && s.charAt(i) == ' ') i--;
        while(i >=0 && s.charAt(i) != ' ') {
            i--;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        day34ds_02 obj = new day34ds_02();
        String s = "Hello World";
        System.out.println(obj.lengthOfLastWord(s));
    }
}
