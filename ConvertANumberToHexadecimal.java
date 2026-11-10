class ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        String result = "";
        long n = num;
        
        if (n < 0) {
            n = n + 4294967296L;
        }
        
        while (n > 0) {
            int rem = (int)(n % 16);
            result = hexDigits[rem] + result;
            n = n / 16;
        }
        
        return result;
    }

    public static void main(String[] args) {
        ConvertANumberToHexadecimal solver = new ConvertANumberToHexadecimal();
        System.out.println(solver.toHex(26));
        System.out.println(solver.toHex(-1));
    }
}