class RomanConverter {
    public int romanToInt(String s) {
        if (s == null || s.trim().isEmpty()) {
            System.out.println("Input is empty or null.");
            return -1;
        }
        s = s.toUpperCase();
        int sum = 0;
        int curCharValue = 0;
        try {
            for (int i = 0; i < s.length(); i++) {
                int nextCharValue = romanCharToInt(s.charAt(i));

                if (curCharValue < nextCharValue) {
                    sum -= curCharValue;
                } else {
                    sum += curCharValue;
                }
                curCharValue = nextCharValue;
            }
            sum += curCharValue;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return -1;
        }
        return sum;
    }

    private int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new NumberFormatException("Invalid Roman numeral character: " + c);
        }
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "";
        RomanConverter obj = new RomanConverter();
        try {
            int result = obj.romanToInt(romanNumeral);
            System.out.println("The integer value of " + romanNumeral + " is: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
