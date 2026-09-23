class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        int maxLength = Math.max(num1.length(), num2.length()) + 1;
        char[] result = new char[maxLength];
        int k = maxLength - 1;
        while (i >= 0 && j >= 0) {
            int sum = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + carry;
            result[k--] = (char) ((sum % 10) + '0');
            carry = sum / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = (num1.charAt(i) - '0') + carry;
            result[k--] = (char) ((sum % 10) + '0');
            carry = sum / 10;
            i--;
        }
        while (j >= 0) {
            int sum = (num2.charAt(j) - '0') + carry;
            result[k--] = (char) ((sum % 10) + '0');
            carry = sum / 10;
            j--;
        }
        if (carry > 0) {
            result[k--] = (char) (carry + '0');
        }
        int startOffset = k + 1;
        return new String(result, startOffset, maxLength - startOffset);
    }
}
