public class day37ds_02 {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++) {
            StringBuilder sb = new StringBuilder();
            String s = words[i];
            for(int j=s.length()-1; j>=0; j--) {
                sb.append(s.charAt(j));
            }
            if(sb.toString().equals(words[i])) {
                return sb.toString();
            }
            
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        day37ds_02 obj = new day37ds_02();
        System.out.println(obj.firstPalindrome(words));
    }
}
