public class HugeInteger {
    private int[] digits = new int[40];

    public void input(String number) {
        int len = number.length();
        for(int i = 0; i< len; i++) {
            digits[40-len + i] = number.charAt(i) - '0';
        }
    }

    public String output() {
        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for(int digit : digits) {
            if(digit != 0 || !leadingZero) {
                result.append(digit);
                leadingZero = false;
            }
        }
    
    return leadingZero ? "0" : result.toString();
    }

    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        for (int i = 39; i >=0; i--) {
            int sum = digits[i] + other.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum/10;

        }
        return result;
    }

    public boolean isEqualTo(HugeInteger other) {
        for(int i = 0; i < 40; i++) {
            if(digits[i] != other.digits[i]) return false;
        }
        return true;
    } 

}