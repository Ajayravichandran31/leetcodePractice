public class AddBinary {
    public static void main(String[] args) {
        AddBinary solver = new AddBinary();
        System.out.println(solver.addBinary("11", "1"));
        System.out.println(solver.addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        int maxLen = Math.max(a.length(), b.length());
        char[] result = new char[maxLen + 1];
        int k = result.length - 1;
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            
            result[k] = (char) ((sum % 2) + '0');
            carry = sum / 2;
            
            i--;
            j--;
            k--;
        }
        
        if (carry > 0) {
            result[0] = (char) (carry + '0');
            return new String(result);
        } else {
            return new String(result, 1, maxLen);
        }
    }
}