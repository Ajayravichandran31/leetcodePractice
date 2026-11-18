class Base7 {
    public static void main(String[] args) {
        Base7 solution = new Base7();
        System.out.println(solution.convertToBase7(100));
        System.out.println(solution.convertToBase7(-7));
        System.out.println(solution.convertToBase7(0));
    }

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        
        String ans = "";
        while (num > 0) {
            int rem = num % 7;
            ans = rem + ans;
            num = num / 7;
        }
        
        if (isNegative) {
            ans = "-" + ans;
        }
        return ans;
    }
}