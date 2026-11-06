class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        String result = "";
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                result += "[.]";
            } else {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DefangingAnIPAddress solution = new DefangingAnIPAddress();
        String address = "1.1.1.1";
        System.out.println(solution.defangIPaddr(address));
    }
}