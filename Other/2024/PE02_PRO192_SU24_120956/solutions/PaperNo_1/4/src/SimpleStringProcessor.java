public class SimpleStringProcessor implements StringProcessor {

    @Override
    public int countCharacters(String str, char ch) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        char lowerCh = Character.toLowerCase(ch);
        char upperCh = Character.toUpperCase(ch);

        for (char c : str.toCharArray()) {
            if (c == lowerCh || c == upperCh) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countWordBeginByString(String s1, String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        String[] words = s1.split("\\s+");
        String lowerS2 = s2.toLowerCase();

        for (String word : words) {
            if (word.toLowerCase().startsWith(lowerS2)) {
                count++;
            }
        }
        return count;
    }
}
