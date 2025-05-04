public class day5pf {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;
        int start = 2;
        int end = num/2;
        while(start <= end) {
            int mid = (start + end)/2;
            if (mid == num/mid && num % mid == 0){
                return true;
            }
            else if(mid < num/mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        day5pf obj = new day5pf();
        System.out.println(obj.isPerfectSquare(16));
    }
}
