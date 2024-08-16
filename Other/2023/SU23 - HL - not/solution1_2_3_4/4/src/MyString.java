import java.util.HashSet;
import java.util.Set;

public class MyString implements IString {
    @Override
    public int f1(String str) {
        String[] words = str.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.length() >= 2 && isPalindrome(word)) {
                count += word.length();
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        StringBuilder result = new StringBuilder();
        Set<Character> seenCharacters = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seenCharacters.contains(c)) {
                result.append(c);
                seenCharacters.add(c);
            }
        }

        return result.toString();
    }

    private boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}