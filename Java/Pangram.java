class PangramChecker {

    public boolean isPangram(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }

        boolean[] letters = new boolean[26];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }
        for (boolean letterPresent : letters) {
            if (!letterPresent) {
                return false;
            }
        }
        return true;
    }
}

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        PangramChecker pangramChecker = new PangramChecker();
        try {
            boolean isPangram = pangramChecker.isPangram(str);
            if (isPangram) {
                System.out.println("The string is a pangram");
            } else {
                System.out.println("The string is not a pangram");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}